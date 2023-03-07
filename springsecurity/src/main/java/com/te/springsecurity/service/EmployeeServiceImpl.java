package com.te.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springsecurity.dao.EmployeeDAO;
import com.te.springsecurity.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;

	@Override
	public Employee addEmployee(Employee employee) {
		System.out.println("add" + employee);
		// TODO Auto-generated method stub
		return dao.save(employee);
	}

	@Override
	public Employee getEmployee(String empId) {
		// TODO Auto-generated method stub
		return dao.findByEmpId(empId);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
