package com.auth_server.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class AppSecurityConfig {

    private static  final String[] WHITE_LIST_URLS = {
        "/public/**"
//            , "/**"
    };

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity){
        try {
            return httpSecurity
                    .cors(Customizer.withDefaults())
                    .authorizeHttpRequests(req -> req.requestMatchers(WHITE_LIST_URLS)
                            .permitAll().anyRequest().authenticated())
                    .formLogin(AbstractHttpConfigurer::disable)
                    .httpBasic(Customizer.withDefaults())
//                    .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
