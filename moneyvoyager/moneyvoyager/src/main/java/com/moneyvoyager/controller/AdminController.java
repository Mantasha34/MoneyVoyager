package com.moneyvoyager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moneyvoyager.beans.Admin;
import com.moneyvoyager.beans.User;
import com.moneyvoyager.services.AdminService;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService service;

	
//	http://localhost:8086/admin/all?status=pending
	@GetMapping("/all")
	public List<User> getAllUsersWithPendingApproval(@RequestParam("status") String status) {
		return service.getUsers(status);
		
	}
	
	@PostMapping("/approve-user/{userId}")
	public void approveUser(@PathVariable Long userId) {
		service.approveUser(userId);
	}
	
	@PostMapping("/delete-user/{userId}")
	public void deleteUser(@PathVariable Long userId) {
		service.deleteUser(userId);
	}
	
	@GetMapping("/login")
	public Admin login(@RequestParam("adminName") String adminName, @RequestParam("password") String password) {
		return service.login(adminName, password);
	}
}