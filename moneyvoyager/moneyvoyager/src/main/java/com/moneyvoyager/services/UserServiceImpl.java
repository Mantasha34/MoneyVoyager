package com.moneyvoyager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneyvoyager.beans.User;
import com.moneyvoyager.dao.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public void addUser(User u) {
		userRepo.save(u);
	}

	@Override
	public boolean checkIfUserExists(long aadhaar) {
		System.out.println(aadhaar);
		if(userRepo.findByUserAadhaar(aadhaar)!=null)
			return true;
		else
			return false;
	}


	
}
