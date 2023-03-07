package com.te.springpagination.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUCT_TABLE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	private Integer quantity;

	private Long price;

	public Product(String name, Integer quantity, Long price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}


}
