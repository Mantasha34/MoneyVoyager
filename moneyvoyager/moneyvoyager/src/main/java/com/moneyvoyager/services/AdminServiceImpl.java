package com.moneyvoyager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneyvoyager.beans.Admin;
import com.moneyvoyager.beans.User;
import com.moneyvoyager.dao.AdminRepository;
import com.moneyvoyager.dao.UserRepository;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private AdminRepository adminRepo;
	
	@Override
	public List<User> getUsers(String applicationStatus) {
		
		return userRepo.findAllByApplicationStatus(applicationStatus);
	}

	@Override
	public void approveUser(Long userId) {
		
		System.out.println("User Id: "+userId);
		User user = userRepo.findById(userId).get();
		user.setApplicationStatus("approved");
		userRepo.save(user);
	}

	@Override
	public void deleteUser(Long userId) {
		
		userRepo.deleteById(userId);
	}

	@Override
	public Admin login(String adminName, String password) {
		Optional<Admin> admin = adminRepo.findByAdminName(adminName);
		if (admin.isPresent()) {
			return admin.get().getPassword().equalsIgnoreCase(password)?admin.get():null;
		} else {
			return null;
		}
	}

}
