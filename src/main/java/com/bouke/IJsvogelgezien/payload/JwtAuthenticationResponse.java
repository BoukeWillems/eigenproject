package com.bouke.IJsvogelgezien.payload;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JwtAuthenticationResponse {
    // Getters and setters
    private String accessToken;
    private String tokenType = "Bearer";

    public JwtAuthenticationResponse(String accessToken) {
        this.accessToken = accessToken;
    }

}