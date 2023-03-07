package com.te.bootwithstream.service;

import java.util.List;
import java.util.Map;

import com.te.bootwithstream.entity.Customer;
import com.te.bootwithstream.entity.Order;
import com.te.bootwithstream.entity.Product;

public interface OrderService {

	public Order saveOrder(Order order, Long custId);

	public List<Order> productlist();

	public List<Product> list();

	public List<Order> list2();

	public List<Order> list3();

	public Double list4();

	public Double list5();

	public Map<Long, Integer> list6();

	public Map<Customer, List<Order>> list7();

	public List<Order> deliverydate();

	public Map<String, String> deliverytime();

	Map<Order, Double> list8();

}
