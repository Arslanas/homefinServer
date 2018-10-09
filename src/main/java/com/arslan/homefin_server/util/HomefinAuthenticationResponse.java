package com.arslan.homefin_server.util;

import com.arslan.homefin_server.security.payload.JwtAuthenticationResponse;
import lombok.Data;

@Data
public class HomefinAuthenticationResponse {
    private final JwtAuthenticationResponse response;
    private final long userId;

    public HomefinAuthenticationResponse(JwtAuthenticationResponse response, long userId) {
        this.response = response;
        this.userId = userId;
    }
}
