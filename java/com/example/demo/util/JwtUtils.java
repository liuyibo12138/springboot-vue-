package com.example.demo.util;


import com.example.demo.entity.loginDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
// JWT工具类
public class JwtUtils {
    // 密钥(开发者设置)
    public static final String SECRET_KEY = "secret";

    // 过期时间（毫秒）
    private static final long EXPIRE_TIME = 60 * 60 * 1000;

    // 发行者
    private static final String ISSUER = "Bing";

    // 生成token
    public static String createToken(loginDTO user) {
        // 创建一个ObjectMapper对象，用于转换用户对象为JSON字符串
        ObjectMapper objectMapper = new ObjectMapper();
        String userJson = null;
        try {
            userJson = objectMapper.writeValueAsString(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 使用Jwts构建token
        String token = Jwts.builder()
                .setSubject(userJson) // 设置有效载荷为用户信息
                .setIssuer(ISSUER) // 设置发行者
                .setIssuedAt(new Date()) // 设置发行时间
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_TIME)) // 设置过期时间
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY) // 设置签名算法和密钥
                .compact(); // 生成token字符串
        return token;
    }

    // 解析token
    public static loginDTO parseToken(String token) {
        // 使用Jwts解析token
        Claims claims = Jwts.parser()
                .setSigningKey(SECRET_KEY) // 设置密钥
                .parseClaimsJws(token) // 解析token字符串
                .getBody(); // 获取有效载荷部分
        String userJson = claims.getSubject(); // 获取用户信息
        ObjectMapper objectMapper = new ObjectMapper();
        loginDTO user = null;
        try {
            user = objectMapper.readValue(userJson, loginDTO.class); // 转换为用户对象
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
