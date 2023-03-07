package com.te.springsecurity.filter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.te.springsecurity.jwtutil.EmployeeJwtUtil;
import com.te.springsecurity.service.EmployeeUserDetailService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class EmployeeJwtFilter extends OncePerRequestFilter {

	@Autowired
	private EmployeeUserDetailService detailService;

	@Autowired
	private EmployeeJwtUtil jwtUtil;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String jwt = null;
		String extractUserName = null;
		String header = request.getHeader("Authorization");
		if (header != null && header.startsWith("Bearer ")) {
			jwt = header.substring(7);
			extractUserName = jwtUtil.extractUsername(jwt);
		}
		if (extractUserName != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			UserDetails userDetails = detailService.loadUserByUsername(extractUserName);
			if (jwtUtil.validateToken(jwt, userDetails)) {
				UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(null,
						userDetails, userDetails.getAuthorities());
				authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(authenticationToken);

			}
		}
		filterChain.doFilter(request, response);
	}

}
