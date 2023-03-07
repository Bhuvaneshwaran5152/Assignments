package com.te.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springsecurity.dto.AuthenticationRequest;
import com.te.springsecurity.dto.AuthenticationResponse;
import com.te.springsecurity.dto.SuccessResponse;
import com.te.springsecurity.jwtutil.EmployeeJwtUtil;
import com.te.springsecurity.model.Employee;
import com.te.springsecurity.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private AuthenticationManager manager;

	@Autowired
	private EmployeeJwtUtil jwtUtil;

	@Autowired
	private UserDetailsService detailsService;

	@Autowired
	private EmployeeService service;

	@PostMapping("/getAuthenticate")
	public ResponseEntity<AuthenticationResponse> getAuthenticate(@RequestBody AuthenticationRequest request) {
		manager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmpId(), request.getPassword()));
		UserDetails loadUserByUsername = detailsService.loadUserByUsername(request.getEmpId());
		String generateToken = jwtUtil.generateToken(loadUserByUsername);
		return new ResponseEntity<AuthenticationResponse>(new AuthenticationResponse(generateToken), HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
		Employee addEmployee = service.addEmployee(employee);
		if (addEmployee != null) {
			return new ResponseEntity<String>("Data saved", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Data Not saved", HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/get/{empId}")
	public ResponseEntity<SuccessResponse> getEmployee(@PathVariable String empId) {

		System.out.println("get method");
		Employee getEmployee = service.getEmployee(empId);
		if (getEmployee != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(getEmployee).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			System.out.println("get not exist");
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(getEmployee).error(true).msg("Failure").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<SuccessResponse> getAllEmployee() {

		System.out.println("get method");
		List<Employee> getEmployee = service.getAllEmployee();
		if (getEmployee != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(getEmployee).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			System.out.println("get not exist");
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(getEmployee).error(true).msg("Failure").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

}
