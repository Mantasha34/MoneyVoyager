package com.moneyvoyager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.moneyvoyager.beans.Customer;
import com.moneyvoyager.dao.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository repo;
	
	@Override
	public ResponseEntity<?> loginCustomer(Customer customer) {
		System.out.println("Inside Login Customer spring Service");

		Customer c = repo.findById(customer.getCustId()).get();
		if(c.getCustPass().equals(customer.getCustPass()))
			return ResponseEntity.ok(c);
		
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}

}
