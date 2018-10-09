package com.arslan.homefin_server.security.controller;

import com.arslan.homefin_server.entity.Bill;
import com.arslan.homefin_server.entity.Role;
import com.arslan.homefin_server.entity.RoleName;
import com.arslan.homefin_server.entity.User;
import com.arslan.homefin_server.repository.RoleRepository;
import com.arslan.homefin_server.repository.UserRepository;
import com.arslan.homefin_server.security.JwtTokenProvider;
import com.arslan.homefin_server.security.exception.AppException;
import com.arslan.homefin_server.security.payload.ApiResponse;
import com.arslan.homefin_server.security.payload.JwtAuthenticationResponse;
import com.arslan.homefin_server.security.payload.LoginRequest;
import com.arslan.homefin_server.security.payload.SignUpRequest;
import com.arslan.homefin_server.service.interfaces.BillService;
import com.arslan.homefin_server.util.HomefinAuthenticationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.net.URI;
import java.util.Collections;

@RestController
@RequestMapping("auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    BillService billService;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtTokenProvider tokenProvider;

    @PostMapping("/signin")
    public ResponseEntity authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        System.out.println(loginRequest);
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );
        System.out.println(authentication);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        User user = userRepository.getUserByUsername(loginRequest.getUsername());
        String jwt = tokenProvider.generateToken(authentication);
        return ResponseEntity.ok(new HomefinAuthenticationResponse(new JwtAuthenticationResponse(jwt), user.getId()));
    }

    @PostMapping("/signup")
    public ResponseEntity registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
        if(userRepository.existsByUsername(signUpRequest.getUsername())) {
            return new ResponseEntity(new ApiResponse(false, "Username is already taken!"),
                    HttpStatus.BAD_REQUEST);
        }

        if(userRepository.existsByEmail(signUpRequest.getEmail())) {
            return new ResponseEntity(new ApiResponse(false, "Email Address already in use!"),
                    HttpStatus.BAD_REQUEST);
        }

        // Creating user's account
        User user = new User(signUpRequest.getName(), signUpRequest.getUsername(),
                signUpRequest.getEmail(), signUpRequest.getPassword());

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        Role userRole = roleRepository.getByRolename(RoleName.ROLE_USER)
                .orElseThrow(() -> new AppException("User Role not set."));

        user.setRoles(Collections.singleton(userRole));

        User result = userRepository.save(user);

        Bill bill = new Bill(new BigDecimal(0), "RUB", result.getId());

        billService.save(bill);

        URI location = ServletUriComponentsBuilder
                .fromCurrentContextPath().path("/users/{username}")
                .buildAndExpand(result.getUsername()).toUri();

        return ResponseEntity.created(location).body(new ApiResponse(true, "User registered successfully"));
    }
}
