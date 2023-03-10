package com.te.beanvalidation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Getter

@Setter

@AllArgsConstructor

@NoArgsConstructor
public class Employee {
	
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty (message = "NAME SHOULD NOT BE NULL")
	private String ename;
	
	@Email (message = "EMAIL SHOULD BE IN PROPER ORDER ")
	@NotNull (message = "IT SHOULD NOT BE NULL")
	@NotEmpty (message ="IT SHOULD NOT BE EMPTY")
	private String email;
	
	@Size (min=8,message = "SHOULD BE MORE THAN 8 CHARACTERS")
	private String password;
	
	

}
