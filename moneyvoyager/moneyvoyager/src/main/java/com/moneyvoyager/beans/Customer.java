package com.moneyvoyager.beans;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private long custId;

	@Column(name="ACCOUNT_No")
	private long accNo;
	
	@Column(name="ACCOUNT_BAL")
	private double accBal;
	
	@Column(name="CUST_PASSWORD")
	private String custPass;
	
	@OneToOne
	@JoinColumn(name="USERID")
	User user;

	public Customer(long custId, long accNo, double accBal, String custPass, User user) {
		super();
		this.custId = custId;
		this.accNo = accNo;
		this.accBal = accBal;
		this.custPass = custPass;
		this.user = user;
	}

	public Customer() {
		super();
	}

	public Customer(long custId, String custPass) {
		super();
		this.custId = custId;
		this.custPass = custPass;
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}

	public String getCustPass() {
		return custPass;
	}

	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", accNo=" + accNo + ", accBal=" + accBal + ", custPass=" + custPass
				+ ", user=" + user + "]";
	}

	



}
