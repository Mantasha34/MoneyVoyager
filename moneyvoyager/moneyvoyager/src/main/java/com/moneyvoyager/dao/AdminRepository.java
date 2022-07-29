package com.moneyvoyager.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moneyvoyager.beans.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	Optional<Admin> findByAdminName(String adminName);
}
