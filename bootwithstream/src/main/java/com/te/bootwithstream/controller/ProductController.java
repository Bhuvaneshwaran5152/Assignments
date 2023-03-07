package com.te.bootwithstream.controller;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.bootwithstream.DTO.ProductDTO;
import com.te.bootwithstream.entity.Customer;
import com.te.bootwithstream.entity.Order;
import com.te.bootwithstream.entity.Product;
import com.te.bootwithstream.exception.IdNotAvailable;
import com.te.bootwithstream.response.SuccessResponse;
import com.te.bootwithstream.service.CustomerService;
import com.te.bootwithstream.service.OrderService;
import com.te.bootwithstream.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@Autowired
	private OrderService orderService;

	@Autowired
	private CustomerService service3;

	@PostMapping("/saveCustomer")
	public ResponseEntity<SuccessResponse> saveCustomer(@RequestBody Customer customer) {
		Customer addCustomer = service3.addCustomer(customer);
		if (addCustomer != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(addCustomer).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(addCustomer).error(true).msg("Failure").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/saveOrder/{id}")
	public ResponseEntity<SuccessResponse> saveCustomer(@RequestBody Order order, @PathVariable Long id) {
		Order addOrder = orderService.saveOrder(order, id);
		if (addOrder != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(addOrder).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(addOrder).error(true).msg("Failure").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/saveProduct")
	public ResponseEntity<SuccessResponse> saveProduct(@RequestBody Product product) {
		Product addProduct = service.addProduct(product);
		if (addProduct != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(addProduct).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(addProduct).error(true).msg("Failure").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<SuccessResponse> updateProduct(@RequestBody Map<String, String> field,
			@PathVariable Integer id) {
		Product addProduct = null;
		try {
			addProduct = service.addProduct(field, id);
			if (addProduct != null) {
				return new ResponseEntity<SuccessResponse>(
						SuccessResponse.builder().data(addProduct).error(false).msg("success").build(), HttpStatus.OK);
			} else {
				throw new IdNotAvailable("id not available");

			}
		} catch (Exception e) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(addProduct).error(true).msg(e.getMessage()).build(),
					HttpStatus.BAD_REQUEST);
		}

	}

//qns1

	@GetMapping("/getProduct")
	public ResponseEntity<SuccessResponse> getProduct() {
		List<Product> discountList = service.productList();
		if (!discountList.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(discountList).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(discountList).error(true).msg("Failure").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

//qns3
	@GetMapping("/getDiscount")
	public ResponseEntity<SuccessResponse> getDiscount() {
		List<Product> discountList = service.productListwithDiscount();
		if (!discountList.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(discountList).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(discountList).error(true).msg("Failure").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

//qns2
	@GetMapping("/productList")
	public ResponseEntity<SuccessResponse> getOrdersBaby() {
		List<Order> list = orderService.productlist();
		if (!list.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list).error(true).msg("Failure").build(), HttpStatus.BAD_REQUEST);
		}
	}

	// qns4
	@GetMapping("/ProductOrder")
	public ResponseEntity<SuccessResponse> getProductOrder() {
		List<Product> list = orderService.list();
		if (!list.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list).error(true).msg("Failure").build(), HttpStatus.BAD_REQUEST);
		}
	}

	// QNS5
	@GetMapping("/ProductList5")
	public ResponseEntity<SuccessResponse> getPro() {
		double list1 = service.list1();
		if (list1 != 0.0) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(true).msg("Failure").build(), HttpStatus.BAD_REQUEST);
		}
	}

	// qns6
	@GetMapping("/OrderList6")
	public ResponseEntity<SuccessResponse> getProduct6() {
		List<Order> list1 = orderService.list2();
		if (!list1.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(true).msg("Failure").build(), HttpStatus.BAD_REQUEST);
		}
	}

	// qns7
	@GetMapping("/OrderList7")
	public ResponseEntity<SuccessResponse> getProduct7() {
		List<Order> list1 = orderService.list3();
		if (!list1.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(true).msg("Failure").build(), HttpStatus.BAD_REQUEST);
		}
	}

	// qns8
	@GetMapping("/OrderList8")
	public ResponseEntity<SuccessResponse> getProduct8() {
		Double list1 = orderService.list4();
		if (list1 != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(true).msg("Failure").build(), HttpStatus.BAD_REQUEST);
		}
	}

	// qns9
	@GetMapping("/OrderList9")
	public ResponseEntity<SuccessResponse> getProduct9() {
		Double list1 = orderService.list5();
		if (list1 != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(true).msg("Failure").build(), HttpStatus.BAD_REQUEST);
		}
	}

	// qns10
	@GetMapping("/productList10")
	public ResponseEntity<SuccessResponse> getProduct10() {
		DoubleSummaryStatistics list1 = service.statistics();
		if (list1 != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(true).msg("Failure").build(), HttpStatus.BAD_REQUEST);
		}
	}

	// qns11
	@GetMapping("/OrderList11")
	public ResponseEntity<SuccessResponse> getProduct11() {
		Map<Long, Integer> list1 = orderService.list6();
		if (list1 != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(true).msg("Failure").build(), HttpStatus.BAD_REQUEST);
		}
	}

	// qns12
	@GetMapping("/OrderList12")
	public ResponseEntity<SuccessResponse> getProduct12() {
		Map<Customer, List<Order>> list1 = orderService.list7();
		if (list1 != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(true).msg("Failure").build(), HttpStatus.BAD_REQUEST);
		}
	}

	// qns13
	@GetMapping("/OrderList13")
	public ResponseEntity<SuccessResponse> getProduct13() {
		Map<Order, Double> list1 = orderService.list8();
		if (list1 != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(true).msg("Failure").build(), HttpStatus.BAD_REQUEST);
		}
	}

	// qns14
	@GetMapping("/productList14")
	public ResponseEntity<SuccessResponse> list2() {
		Map<String, List<String>> list1 = service.list2();
		if (list1 != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(true).msg("Failure").build(), HttpStatus.BAD_REQUEST);
		}
	}

	// qns15
	@GetMapping("/productList15")
	public ResponseEntity<SuccessResponse> list3() {
		Map<String, Optional<Product>> list1 = service.list3();
		if (list1 != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(list1).error(true).msg("Failure").build(), HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/deliverydate")
	public ResponseEntity<SuccessResponse> delivery() {
		List<Order> deliverydate = orderService.deliverydate();
		if (!deliverydate.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(deliverydate).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(deliverydate).error(true).msg("Failure").build(),
					HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping("/deliverydays")
	public ResponseEntity<SuccessResponse> deliveryday() {
		Map<String, String> deliverytime = orderService.deliverytime();
		if (!deliverytime.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(deliverytime).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(deliverytime).error(true).msg("Failure").build(),
					HttpStatus.BAD_REQUEST);
		}

	}
}
