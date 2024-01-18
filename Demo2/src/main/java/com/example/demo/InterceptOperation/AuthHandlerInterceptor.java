package com.example.demo.InterceptOperation;

import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.example.demo.config.GenerateToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.MalformedJwtException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.SignatureException;
import java.util.HashMap;
import java.util.Map;
@Component
public class AuthHandlerInterceptor  implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取请求路径
        String requestPath = request.getRequestURI();
        Map<String,Object> map = new HashMap<>();
        // 如果是登录接口，则放行
        if ("/home/login".equals(requestPath)) {
            return true;
        }

        // 在这里添加你的身份验证逻辑
        // 例如，验证请求头中是否包含有效的 Token
        String token = request.getHeader("token");
//        // 示例：判断请求头中是否包含 Token
//        String token = request.getHeader("Authorization");
        GenerateToken generateToken = new GenerateToken();
        try{
            generateToken.verify(token);//验证令牌
            return true;//放行请求
        } catch (TokenExpiredException e) {
            e.printStackTrace();
            map.put("msg","token过期");
        } catch (AlgorithmMismatchException e) {
            e.printStackTrace();
            map.put("msg","token算法不一致");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Caught exception of type: " + e.getClass().getName());
            map.put("msg","token无效");
        }

        String resultJson = new ObjectMapper().writeValueAsString(map);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().print(resultJson);

        return false;
    }
}
