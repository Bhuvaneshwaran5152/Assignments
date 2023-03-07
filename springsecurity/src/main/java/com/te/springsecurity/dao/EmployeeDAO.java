package com.te.springsecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.springsecurity.model.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, String> {

	Employee findByEmpId(String empId);

}
