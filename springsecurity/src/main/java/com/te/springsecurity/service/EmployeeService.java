package com.te.springsecurity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.te.springsecurity.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public Employee getEmployee(String empId);

	public List<Employee> getAllEmployee();

}
