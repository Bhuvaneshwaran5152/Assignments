package com.te.bootwithstream.service;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.bootwithstream.DTO.ProductDTO;
import com.te.bootwithstream.entity.Order;
import com.te.bootwithstream.entity.Product;
import com.te.bootwithstream.exception.IdNotAvailable;
import com.te.bootwithstream.repository.OrderDAO;
import com.te.bootwithstream.repository.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productRepo;

	@Autowired
	private OrderDAO orderDAO;

	@Override
	public Product addProduct(Product product) {
		List<Order> findAll = orderDAO.findAll();
		Set<Order> products = new HashSet<>(findAll);
		product.setOrders(products);
		return productRepo.save(product);
	}

	@Override
	public List<Product> productListwithDiscount() {
		List<Product> result = productRepo.findAll().stream().filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
				.map(p -> p.withPrice(p.getPrice() * 0.9)).collect(Collectors.toList());
		return result;
	}

	@Override
	public List<Product> productList() {
		List<Product> result = productRepo.findAll().stream().filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.filter(p -> p.getPrice() > 100).collect(Collectors.toList());
		return result;
	}

	@Override
	public double list1() {
		double min = productRepo.findAll().stream().filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.mapToDouble(p -> p.getPrice()).summaryStatistics().getMin();

		return min;
	}

	@Override
	public DoubleSummaryStatistics statistics() {
		DoubleSummaryStatistics statistics = productRepo.findAll().stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books")).mapToDouble(p -> p.getPrice())
				.summaryStatistics();

		System.out.println(
				String.format("count = %1$d, average = %2$f, max = %3$f, min = %4$f, sum = %5$f", statistics.getCount(),
						statistics.getAverage(), statistics.getMax(), statistics.getMin(), statistics.getSum()));
		return statistics;

	}

	@Override
	public Map<String, List<String>> list2() {
		Map<String, List<String>> result = productRepo.findAll().stream().collect(Collectors.groupingBy(
				Product::getCategory, Collectors.mapping(product -> product.getName(), Collectors.toList())));
		return result;

	}

	@Override
	public Map<String, Optional<Product>> list3() {
		Map<String, Optional<Product>> result = productRepo.findAll().stream().collect(
				Collectors.groupingBy(Product::getCategory, Collectors.maxBy(Comparator.comparing(Product::getPrice))));
		return result;
	}

	@Override
	public Product addProduct(Map<String, String> field, Integer id) {
		Product product2 = null;
		try {
			product2 = productRepo.findById(id).get();
			if (product2.getId() == id) {
//				product2.setName(product.getName());
//				product2.setCategory(product.getCategory());
				// BeanUtils.copyProperties(product, product2);
				if (field.containsKey("name")) {
					product2.setName(field.get("name"));
				}  
				if (field.containsKey("category")) {
					product2.setCategory(field.get("category"));
				}
			} else {

				throw new IdNotAvailable("Id Not Available");

			}
		} catch (IdNotAvailable e) {
			e.printStackTrace();
		}

		return productRepo.save(product2);

	}
}