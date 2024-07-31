package com.project.restaurant_management.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import jakarta.servlet.http.HttpServletRequest;

import static org.springframework.security.config.Customizer.withDefaults;

import java.util.Arrays;
import java.util.Collections;

@Configuration
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception
	{
        http.sessionManagement(management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authorize -> authorize.requestMatchers("/dish/**").authenticated().anyRequest().permitAll())
                .addFilterBefore(null, null).csrf(csrf -> csrf.disable())
                .cors(cors -> cors.configurationSource(new CorsConfigurationSource() {

                    @Override
                    public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {

                    	CorsConfiguration cfg=new CorsConfiguration();
                    	cfg.setAllowedOrigins(Arrays.asList("http://localhost:3000"));
                    	cfg.setAllowedMethods(Collections.singletonList("*"));
                    	cfg.setAllowCredentials(true);
                    	cfg.setAllowedHeaders(Collections.singletonList("*"));
                    	cfg.setExposedHeaders(Arrays.asList("Authorization"));
                    	cfg.setMaxAge(3600L);
                        return cfg;
                    }
                })).httpBasic(withDefaults()).formLogin(withDefaults());
		
		return http.build();
	}

}
