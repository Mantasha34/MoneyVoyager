package com.moneyvoyager.services;

import org.springframework.http.ResponseEntity;

import com.moneyvoyager.beans.Customer;

public interface CustomerService {

	public ResponseEntity<?> loginCustomer(Customer customer);

}
