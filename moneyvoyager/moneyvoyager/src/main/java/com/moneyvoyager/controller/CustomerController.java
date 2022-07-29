package com.moneyvoyager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moneyvoyager.beans.Customer;
import com.moneyvoyager.services.CustomerService;


@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/customer-api")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	// http://localhost:8090/customer-api/custlogin
	@PostMapping("/custlogin") 
	public ResponseEntity<?> loginCustomer(@RequestBody Customer customer)
	{
		
		System.out.println("in controller "+customer.getCustId());
		System.out.println("in controller "+customer.getCustPass());
		return service.loginCustomer(customer);
	}

}

