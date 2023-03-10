package com.te.beanvalidation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.beanvalidation.dao.EmployeeDAO;
import com.te.beanvalidation.entity.Employee;

@Service
public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired
	private EmployeeDAO dao;
	@Override
	public Employee addEmployee(Employee employee) {
		
		return dao.save(employee);
	}

}
