package com.moneyvoyager.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor{

	@ExceptionHandler(UserAlreadyExistsException.class)
	public ResponseEntity<?> exception(UserAlreadyExistsException exception) {
	     return new ResponseEntity<>("An Account with this Aadhaar already Exists", HttpStatus.CONFLICT);
	}
}
