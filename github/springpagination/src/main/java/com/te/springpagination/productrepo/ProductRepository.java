package com.te.springpagination.productrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.springpagination.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
