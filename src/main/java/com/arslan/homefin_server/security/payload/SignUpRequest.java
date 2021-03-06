package com.arslan.homefin_server.security.payload;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class SignUpRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String username;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;
}