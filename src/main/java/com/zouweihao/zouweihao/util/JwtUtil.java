package com.zouweihao.zouweihao.util;

import com.zouweihao.zouweihao.entity.User;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.UUID;

public class JwtUtil {
    static long time = 1000*60*60*24;
    static String signature = "Admin";
    public static String createToken(User appcetUser){
        JwtBuilder jwtBuilder = Jwts.builder();
        String jwtToken = jwtBuilder
                // Header
                .setHeaderParam("type", "JWT")
                .setHeaderParam("alg","HS256")
                // Payload
                .claim("user_id",appcetUser.getUser_id())
                .claim("role","Admin")
                .setSubject("admin-test")
                .setExpiration(new Date(System.currentTimeMillis()+time))
                .setId(UUID.randomUUID().toString())
                // Signature签名
                .signWith(SignatureAlgorithm.HS256,signature)
                .compact();
        return jwtToken;
    }
}
