package com.te.springpagination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.te.springpagination.entity.Product;
import com.te.springpagination.productrepo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

//	@PostConstruct
//	public void initDB() {
//		List<Product> products = IntStream.rangeClosed(1, 200)
//				.mapToObj(
//						i -> new Product("product" + i, new Random().nextInt(100), (long) new Random().nextInt(50000)))
//				.collect(Collectors.toList());
//		repository.saveAll(products);
//	}

	public List<Product> findAllProducts() {
		return repository.findAll();
	}

	public List<Product> findProductsWithSorting(String field) {
		return repository.findAll(Sort.by(Sort.Direction.ASC, field));
	}

	public Page<Product> findProductsWithPagination(int offset, int pageSize) {
		Page<Product> products = repository.findAll(PageRequest.of(offset, pageSize));
		return products;
	}

	public Page<Product> findProductsWithpaginationSorting(int offset, int pagesize, String field) {
		Page<Product> products = repository.findAll(PageRequest.of(offset, pagesize).withSort(Sort.by(field)));
		return products;

	}
}
