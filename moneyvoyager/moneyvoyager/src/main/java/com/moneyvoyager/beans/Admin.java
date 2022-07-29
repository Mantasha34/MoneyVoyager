package com.moneyvoyager.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "adminIdSequence")
	@SequenceGenerator(name="adminIdSequence",sequenceName = "adminIdSequence",allocationSize = 1)
	@Column(name = "ADMIN_ID")
	private int adminId;
	
	@Column(name = "ADMIN_NAME")
	private String adminName;
	
	@Column(name = "PASSWORD")
	private String password;

	public Admin(int adminId, String adminName, String password) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.password = password;
	}

	public Admin() {
		super();
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", password=" + password + "]";
	}

	
}
