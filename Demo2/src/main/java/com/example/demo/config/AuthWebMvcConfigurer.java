package com.example.demo.config;

import com.example.demo.InterceptOperation.AuthHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//拦截器
@Configuration
@CrossOrigin
public class AuthWebMvcConfigurer  implements WebMvcConfigurer {

        @Autowired
        AuthHandlerInterceptor authHandlerInterceptor;

        /**
         * 给除了 /login 的接口都配置拦截器,拦截转向到 authHandlerInterceptor
         */
        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(authHandlerInterceptor)
                    .addPathPatterns("/**")
                    .excludePathPatterns("/home/login");
        }
@Override
public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
            .allowedOriginPatterns("*")
            .allowCredentials(true)
            .allowedMethods("GET", "POST", "DELETE", "PUT")
            .allowedHeaders("*")
            .maxAge(3600);
}

}
