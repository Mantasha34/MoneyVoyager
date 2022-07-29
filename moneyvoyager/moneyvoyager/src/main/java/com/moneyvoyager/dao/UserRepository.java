package com.moneyvoyager.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moneyvoyager.beans.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUserAadhaar(long userAadhaar);
	public List<User> findAllByApplicationStatus(String applicationStatus);
}
