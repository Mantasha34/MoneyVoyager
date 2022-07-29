package com.moneyvoyager.services;

import com.moneyvoyager.beans.User;

public interface UserService {

	public void addUser(User u);
	public boolean checkIfUserExists(long aadhaar);
}
