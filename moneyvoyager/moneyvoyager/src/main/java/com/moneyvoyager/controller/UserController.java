package com.moneyvoyager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moneyvoyager.beans.User;
import com.moneyvoyager.exceptions.UserAlreadyExistsException;
import com.moneyvoyager.services.UserService;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/user-api")
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("/register-user")
	public ResponseEntity<?> addUser(@RequestBody User u) throws UserAlreadyExistsException{
		
		  if(service.checkIfUserExists(u.getUserAadhaar()))
			  throw new UserAlreadyExistsException(); 
		  
		  service.addUser(u);
		  return new ResponseEntity<>(HttpStatus.OK);

	}
}
