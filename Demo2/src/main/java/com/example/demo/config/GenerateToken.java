package com.example.demo.config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.demo.entity.Userinfo;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;
@Component
public class GenerateToken {

    // Token 的有效时间，这里设置为一天（单位：毫秒）
    private  long time = 1000 * 60 * 60 * 24;

    // 用于签名的密钥
    private  String signature = "cereshuzhitingnizhenbangcereshuzhitingnizhenbang";
//    @Value("${jwt.expiration}")
    // 创建并返回一个新的 JWT Token
    public  String createToken(Userinfo userinfo) {

        JwtBuilder jwtBuilder = Jwts.builder();
        String jwtToken = jwtBuilder
                // 设置 JWT 头部信息
                .setHeaderParam("typ", "JWT")
                .setHeaderParam("alg", "HS256")

                // 设置 JWT 载荷信息
                .claim("username", userinfo.getUsername())
                .claim("role", userinfo.getId())
                .setSubject("admin-test") // 设置主题

                // 设置过期时间
                .setExpiration(new Date(System.currentTimeMillis() + time))

                // 设置唯一标识符
                .setId(UUID.randomUUID().toString())

                // 使用 HS256 签名算法进行签名
                .signWith(SignatureAlgorithm.HS256, signature)

                // 生成最终的 JWT Token
                .compact();
        System.out.println(jwtToken);
        return jwtToken;
    }
    public  void verify(String token){
             Jwts.parser().setSigningKey(signature).parseClaimsJws(token);
//        JWT.require(Algorithm.HMAC256(signature)).build().verify(token);
    }
}
