package com.te.bootwithstream.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.te.bootwithstream.entity.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
}
