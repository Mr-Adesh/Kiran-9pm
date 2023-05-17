package com.example.demo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {
	@Bean
  public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable()
		.authorizeHttpRequests((auth) -> auth.requestMatchers("/t")
				.hasRole("ADMIN").anyRequest()
				.authenticated())
		.httpBasic(Customizer.withDefaults());
		return httpSecurity.build();
	  
  }
	@Bean
	public static PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public UserDetailsService 	detailsService() {
		UserDetails user1 = User.builder().username("Admin").password(encoder().encode("Admin")).roles("Admin").build();
	return new InMemoryUserDetailsManager(user1);
	} 
	
}
