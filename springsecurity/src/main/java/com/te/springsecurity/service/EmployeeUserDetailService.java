package com.te.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.te.springsecurity.dao.EmployeeDAO;
import com.te.springsecurity.model.Employee;
import com.te.springsecurity.model.MyUserDetails;

@Service
public class EmployeeUserDetailService implements UserDetailsService {

	@Autowired
	private EmployeeDAO employeeDAO;

	private Employee employee;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Employee employee2 = employeeDAO.findByEmpId(username);
		return new MyUserDetails(employee2);
	}

}
