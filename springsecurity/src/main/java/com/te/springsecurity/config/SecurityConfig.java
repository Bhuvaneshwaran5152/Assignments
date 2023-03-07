package com.te.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.te.springsecurity.filter.EmployeeJwtFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private EmployeeJwtFilter filter;

	@Bean
	AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
		return configuration.getAuthenticationManager();

	}

	@Bean
	public PasswordEncoder encoder() {
		return NoOpPasswordEncoder.getInstance();

	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeHttpRequests().requestMatchers("/add").hasRole("ADMIN")
				.requestMatchers("/getAll").hasRole("ADMIN").requestMatchers("/get").hasAnyRole("ADMIN", "USER")
				.requestMatchers("/getAuthenticate").permitAll().anyRequest().authenticated().and()
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
						.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class));

		return http.build();

	}

}
