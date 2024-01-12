package com.example.jwtSpring.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtRequest {
    private String email;
    private String password;
}
