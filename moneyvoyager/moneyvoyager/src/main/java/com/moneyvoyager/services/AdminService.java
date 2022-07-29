package com.moneyvoyager.services;

import java.util.List;

import com.moneyvoyager.beans.Admin;
import com.moneyvoyager.beans.User;

public interface AdminService {

	public List<User> getUsers(String applicationStatus);
	
	public void approveUser(Long userId);

	public void deleteUser(Long userId);

	public Admin login(String adminName, String password);
}
