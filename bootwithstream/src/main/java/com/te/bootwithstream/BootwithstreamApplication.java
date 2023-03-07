package com.te.bootwithstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class BootwithstreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootwithstreamApplication.class, args);
	}

}
