package com.te.bootwithstream.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.bootwithstream.entity.Customer;
import com.te.bootwithstream.entity.Order;
import com.te.bootwithstream.entity.Product;
import com.te.bootwithstream.repository.CustomerDAO;
import com.te.bootwithstream.repository.OrderDAO;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderRepo;

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public List<Order> productlist() {
		List<Order> result = orderRepo.findAll().stream()
				.filter(o -> o.getProducts().stream().anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby")))
				.collect(Collectors.toList());
		return result;
	}

	@Override
	public List<Product> list() {
		List<Product> result = orderRepo.findAll().stream().filter(o -> o.getCustomer().getTier() == 2)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
				.flatMap(o -> o.getProducts().stream()).distinct().collect(Collectors.toList());

		return result;

	}

	@Override
	public List<Order> list2() {
		List<Order> result = orderRepo.findAll().stream().sorted(Comparator.comparing(Order::getOrderDate).reversed())
				.limit(3).collect(Collectors.toList());

		return result;

	}

	@Override
	public List<Order> list3() {
		List<Order> collect = orderRepo.findAll().stream()
				.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15))).collect(Collectors.toList());
				//.peek(o -> System.out.println(o.toString())).flatMap(o -> o.getProducts().stream()).distinct()
				//.collect(Collectors.toList());
		return collect;
	}

	@Override
	public Double list4() {
		Double result = orderRepo.findAll().stream()
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
				.flatMap(o -> o.getProducts().stream()).mapToDouble(p -> p.getPrice()).sum();
		return result;
	}

	@Override
	public Double list5() {
		Double result = orderRepo.findAll().stream().filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
				.flatMap(o -> o.getProducts().stream()).mapToDouble(p -> p.getPrice()).average().getAsDouble();
		return result;

	}

	@Override
	public Map<Long, Integer> list6() {
		Map<Long, Integer> result = orderRepo.findAll().stream()
				.collect(Collectors.toMap(order -> order.getId(), order -> order.getProducts().size()));
		return result;
	}

	@Override
	public Map<Customer, List<Order>> list7() {
		Map<Customer, List<Order>> result = orderRepo.findAll().stream()
				.collect(Collectors.groupingBy(Order::getCustomer));
		return result;

	}

	@Override
	public Map<Order, Double> list8() {
		Map<Order, Double> result = orderRepo.findAll().stream().collect(Collectors.toMap(Function.identity(),
				order -> order.getProducts().stream().mapToDouble(p -> p.getPrice()).sum()));
		return result;
	}

	@Override
	public Order saveOrder(Order order, Long custId) {

		Optional<Customer> customer = customerDAO.findById(custId);
		if (customer.isPresent()) {
			order.setCustomer(customer.get());

		}
		return orderRepo.save(order);
	}

	@Override
	public List<Order> deliverydate() {
		List<Order> findAll = orderRepo.findAll();
		List<Order> order = new ArrayList<>();
		findAll.stream().forEach(i -> {

			if (i.getDeliveryDate().compareTo(LocalDate.now()) == 0) {

				order.add(i);

			}

		});
		return order;
	}

	@Override
	public Map<String, String> deliverytime() {
		Map<String, String> days = new TreeMap<>();
		orderRepo.findAll().stream().forEach(i -> {
			int days2 = Period.between(i.getOrderDate(), i.getDeliveryDate()).getDays();
			days.put("orderid :" + i.getId(), "days :" + days2);
		});
		return days;
	}
}