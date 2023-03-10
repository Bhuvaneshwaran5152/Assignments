package com.te.beanvalidation.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.beanvalidation.entity.Employee;
import com.te.beanvalidation.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/addEmployee")
	public ResponseEntity<?> addEmployee(@Valid @RequestBody Employee employee) {

		Employee addEmployee = service.addEmployee(employee);

		return new ResponseEntity<Employee>(addEmployee, HttpStatus.ACCEPTED);

	}
}
