package com.te.bootwithstream.service;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.te.bootwithstream.DTO.ProductDTO;
import com.te.bootwithstream.entity.Product;

public interface ProductService {
	public Product addProduct(Product product);

	public List<Product> productListwithDiscount();

	public List<Product> productList();

	public double list1();

	public DoubleSummaryStatistics statistics();

	public Map<String, List<String>> list2();

	public Map<String, Optional<Product>> list3();

	public Product addProduct(Map<String, String> field, Integer id);

}
