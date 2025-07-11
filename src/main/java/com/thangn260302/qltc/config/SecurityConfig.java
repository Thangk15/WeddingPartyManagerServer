package com.thangn260302.qltc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Tắt CSRF cho API
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/**").permitAll()  // Cho phép gọi API tự do
                .anyRequest().authenticated()           // Cái khác phải login
            )
            .formLogin(form -> form.disable());  // Tắt login form mặc định

        return http.build();
    }
}
