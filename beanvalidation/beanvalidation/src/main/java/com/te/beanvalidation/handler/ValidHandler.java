package com.te.beanvalidation.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ValidHandler extends ResponseEntityExceptionHandler{


	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		Map<String,String> map=new HashMap<>(); 
		ex.getBindingResult().getAllErrors().forEach((error)-> {
			 String str=((FieldError) error).getField();
			 
			 String defaultMessage = error.getDefaultMessage();
			 map.put(str,defaultMessage);
		});
		
		
		return new ResponseEntity<> (map,HttpStatus.BAD_REQUEST); 
	}
}
