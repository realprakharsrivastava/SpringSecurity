package com.adecco.springSecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class WebSecurity {
	
	 @Deprecated
	    protected void configure(HttpSecurity http) throws Exception {
	        http.authorizeRequests()
	                .requestMatchers("/").permitAll() // Allow access to home page
	                .anyRequest().authenticated() // Authenticate all other requests
	                .and()
	                .formLogin().permitAll(); // Enable form login
	    }

}
