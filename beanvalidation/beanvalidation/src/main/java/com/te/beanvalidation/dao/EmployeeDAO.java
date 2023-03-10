package com.te.beanvalidation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.beanvalidation.entity.Employee;

@Repository
public interface EmployeeDAO  extends JpaRepository<Employee, Integer>{

}
