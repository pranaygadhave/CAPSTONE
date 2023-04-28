package com.employee.management.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employee.management.client.entity.Employee;

@RestController
@RequestMapping("/client/employee")
public class ClientController {

	String baseURL = "https://localhost:8090/employee/get/";

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/get/{employeeID}")
	public Employee getEmployeeByID(@PathVariable long employeeID) {
		return restTemplate.getForObject(baseURL + employeeID, Employee.class);

	}

}

