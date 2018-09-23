package com.arslan.homefin_server.security.payload;

import lombok.Data;

@Data
public class JwtAuthenticationResponse {
    private String accessToken;
    private String tokenType = "Bearer";

    public JwtAuthenticationResponse() {
    }

    public JwtAuthenticationResponse(String accessToken) {
        this.accessToken = accessToken;
    }

}
