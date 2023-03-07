package com.te.springpagination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.springpagination.dto.APIResponse;
import com.te.springpagination.entity.Product;
import com.te.springpagination.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping
	private APIResponse<List<Product>> getProducts() {
		List<Product> allProducts = service.findAllProducts();
		return new APIResponse<>(allProducts.size(), allProducts);

	}

	@GetMapping("/{field}")
	private APIResponse<List<Product>> getProductsWithSort(@PathVariable String field) {
		List<Product> allProducts = service.findProductsWithSorting(field);
		return new APIResponse<>(allProducts.size(), allProducts);

	}

	@GetMapping("/pagination/{offset}/{pageSize}")
	private APIResponse<Page<Product>> getProductWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		Page<Product> productWithPagination = service.findProductsWithPagination(offset, pageSize);
		return new APIResponse<>(productWithPagination.getSize(), productWithPagination);
	}

	@GetMapping("/pagination/{offset}/{pageSize}/{field}")
	private APIResponse<Page<Product>> getProductWithPagination(@PathVariable int offset, @PathVariable int pageSize,
			@PathVariable String field) {
		Page<Product> productWithPagination = service.findProductsWithpaginationSorting(offset, pageSize, field);
		return new APIResponse<>(productWithPagination.getSize(), productWithPagination);
	}

}
