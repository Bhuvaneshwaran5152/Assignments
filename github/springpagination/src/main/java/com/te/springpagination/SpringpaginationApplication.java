package com.te.springpagination;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.springpagination.dto.APIResponse;
import com.te.springpagination.entity.Product;
import com.te.springpagination.service.ProductService;

@SpringBootApplication
public class SpringpaginationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringpaginationApplication.class, args);
	}

}
