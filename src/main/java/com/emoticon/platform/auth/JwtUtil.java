package com.emoticon.platform.auth;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;

public class JwtUtil {

    private Key key;

    public JwtUtil(String secret){
        this.key = Keys.hmacShaKeyFor(secret.getBytes());
    }

    public String createToken(String id, String name) {

        String token = Jwts.builder()
                .claim("id", id)
                .claim("name", name)
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
        return token;
    }
}
