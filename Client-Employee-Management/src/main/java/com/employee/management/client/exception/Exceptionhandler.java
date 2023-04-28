package com.employee.management.client.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
@RestControllerAdvice	
public class Exceptionhandler {

	@ExceptionHandler(HttpClientErrorException.class)
	public ResponseEntity<String> handleHttpClientErrorException(HttpClientErrorException ex){
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
