package com.moneyvoyager.beans;

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
@Table(name = "transactions")
public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="TRANSACTION_ID", nullable = false)
	private long transId;
	
	@Column(name="TRANSACTION_MODE")
	private String transMode;
	
	@Column(name="TRANSACTION_TYPE")
	private String transType;
	
	@Column(name="TRANSACTION_AMT")
	private String transAmt;
	
	@Column(name = "TRANSACTION_DATE")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date transDate;
	
	@Column(name="STATUS")
	private boolean status;
	
	@Column(name="REMARK")
	private String remark;
	
	@Column(name="FROM_ACC")
	private long fromAcc;
	
	@Column(name="TO_ACC")
	private long toAcc;
	
	@ManyToOne
	@JoinColumn(name="CUSTID")
	Customer custId;

	public Transactions(long transId, String transMode, String transType, String transAmt, Date transDate,
			boolean status, String remark, long fromAcc, long toAcc, Customer custId) {
		super();
		this.transId = transId;
		this.transMode = transMode;
		this.transType = transType;
		this.transAmt = transAmt;
		this.transDate = transDate;
		this.status = status;
		this.remark = remark;
		this.fromAcc = fromAcc;
		this.toAcc = toAcc;
		this.custId = custId;
	}

	public Transactions() {
		super();
	}

	public long getTransId() {
		return transId;
	}

	public void setTransId(long transId) {
		this.transId = transId;
	}

	public String getTransMode() {
		return transMode;
	}

	public void setTransMode(String transMode) {
		this.transMode = transMode;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public long getFromAcc() {
		return fromAcc;
	}

	public void setFromAcc(long fromAcc) {
		this.fromAcc = fromAcc;
	}

	public long getToAcc() {
		return toAcc;
	}

	public void setToAcc(long toAcc) {
		this.toAcc = toAcc;
	}

	public Customer getCustId() {
		return custId;
	}

	public void setCustId(Customer custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "Transactions [transId=" + transId + ", transMode=" + transMode + ", transType=" + transType
				+ ", transAmt=" + transAmt + ", transDate=" + transDate + ", status=" + status + ", remark=" + remark
				+ ", fromAcc=" + fromAcc + ", toAcc=" + toAcc + ", custId=" + custId + "]";
	}
	
	
	
}
