package com.arslan.homefin_server.controller;

import com.arslan.homefin_server.entity.EventEntity;
import com.arslan.homefin_server.entity.User;
import com.arslan.homefin_server.service.interfaces.EventService;
import com.arslan.homefin_server.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping()
    public List<User> getAll(@Param("email") String email, @Param("username") String username) {
        if(email != null){
            return Arrays.asList(service.getUserByEmail(email));
        }
        if(username != null){
            return Arrays.asList(service.getUserByUsername(username));
        }
        return service.findAll();
    }

    @GetMapping("{id}")
    public User getOne(@PathVariable("id") Long id) {
        return service.findOne(id);
    }

    @PutMapping()
    public User update(@RequestBody User event) {
        return service.save(event);
    }

    @PostMapping()
    public User create(@RequestBody User event) {
        return service.save(event);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        service.deleteByID(id);
    }
}
