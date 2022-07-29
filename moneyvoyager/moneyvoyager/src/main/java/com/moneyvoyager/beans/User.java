package com.moneyvoyager.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private long userId;

	@Column(name = "USER_TITLE")
	private String userTitle;

	@Column(name = "USER_FIRSTNAME")
	private String userFirstName;

	@Column(name = "USER_MIDDLENAME")
	private String userMiddleName;

	@Column(name = "USER_LASTNAME")
	private String userLastName;

	@Column(name = "USER_MOBILENO")
	private long userPhnNo;

	@Column(name = "USER_EMAIL")
	private String userEmail;

	@Column(name = "USER_AADHAAR", length=12)
	private long userAadhaar;

	@Column(name = "USER_DOB")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date userDob;

	@Column(name = "RESIDENTIAL_ADDRESS")
	private String resAddress;

	@Column(name = "RESIDENTIAL_CITY")
	private String resCity;

	@Column(name = "RESIDENTIAL_STATE")
	private String resState;

	@Column(name = "RESIDENTIAL_ZIP")
	private int resZip;

	@Column(name = "PERMANENT_ADDRESS")
	private String perAddress;

	@Column(name = "PERMANENT_CITY")
	private String perCity;

	@Column(name = "PERMANENT_STATE")
	private String perState;

	@Column(name = "PERMANENT_ZIP")
	private int perZip;

	@Column(name = "USER_OCCUPATIONTYPE")
	private String userOccuType;

	@Column(name = "USER_INCOMESOURCE")
	private String userIncomeSource;

	@Column(name = "USER_GROSSINCOME")
	private double userGrossIncome;

	@Column(name = "DEBITCARD")
	private boolean debitCheck;

	@Column(name = "NETBANKING")
	private boolean netBankingCheck;
	
	@Column(name = "APPLCATION_STATUS")
	private String applicationStatus;

	public User(long userId, String userTitle, String userFirstName, String userMiddleName, String userLastName,
			long userPhnNo, String userEmail, long userAadhaar, Date userDob, String resAddress, String resCity,
			String resState, int resZip, String perAddress, String perCity, String perState, int perZip,
			String userOccuType, String userIncomeSource, double userGrossIncome, boolean debitCheck,
			boolean netBankingCheck, String applicationStatus) {
		super();
		this.userId = userId;
		this.userTitle = userTitle;
		this.userFirstName = userFirstName;
		this.userMiddleName = userMiddleName;
		this.userLastName = userLastName;
		this.userPhnNo = userPhnNo;
		this.userEmail = userEmail;
		this.userAadhaar = userAadhaar;
		this.userDob = userDob;
		this.resAddress = resAddress;
		this.resCity = resCity;
		this.resState = resState;
		this.resZip = resZip;
		this.perAddress = perAddress;
		this.perCity = perCity;
		this.perState = perState;
		this.perZip = perZip;
		this.userOccuType = userOccuType;
		this.userIncomeSource = userIncomeSource;
		this.userGrossIncome = userGrossIncome;
		this.debitCheck = debitCheck;
		this.netBankingCheck = netBankingCheck;
		this.applicationStatus = applicationStatus;
	}

	public User() {
		super();
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserTitle() {
		return userTitle;
	}

	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserMiddleName() {
		return userMiddleName;
	}

	public void setUserMiddleName(String userMiddleName) {
		this.userMiddleName = userMiddleName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public long getUserPhnNo() {
		return userPhnNo;
	}

	public void setUserPhnNo(long userPhnNo) {
		this.userPhnNo = userPhnNo;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public long getUserAadhaar() {
		return userAadhaar;
	}

	public void setUserAadhaar(long userAadhaar) {
		this.userAadhaar = userAadhaar;
	}

	public Date getUserDob() {
		return userDob;
	}

	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}

	public String getResAddress() {
		return resAddress;
	}

	public void setResAddress(String resAddress) {
		this.resAddress = resAddress;
	}

	public String getResCity() {
		return resCity;
	}

	public void setResCity(String resCity) {
		this.resCity = resCity;
	}

	public String getResState() {
		return resState;
	}

	public void setResState(String resState) {
		this.resState = resState;
	}

	public int getResZip() {
		return resZip;
	}

	public void setResZip(int resZip) {
		this.resZip = resZip;
	}

	public String getPerAddress() {
		return perAddress;
	}

	public void setPerAddress(String perAddress) {
		this.perAddress = perAddress;
	}

	public String getPerCity() {
		return perCity;
	}

	public void setPerCity(String perCity) {
		this.perCity = perCity;
	}

	public String getPerState() {
		return perState;
	}

	public void setPerState(String perState) {
		this.perState = perState;
	}

	public int getPerZip() {
		return perZip;
	}

	public void setPerZip(int perZip) {
		this.perZip = perZip;
	}

	public String getUserOccuType() {
		return userOccuType;
	}

	public void setUserOccuType(String userOccuType) {
		this.userOccuType = userOccuType;
	}

	public String getUserIncomeSource() {
		return userIncomeSource;
	}

	public void setUserIncomeSource(String userIncomeSource) {
		this.userIncomeSource = userIncomeSource;
	}

	public double getUserGrossIncome() {
		return userGrossIncome;
	}

	public void setUserGrossIncome(double userGrossIncome) {
		this.userGrossIncome = userGrossIncome;
	}

	public boolean isDebitCheck() {
		return debitCheck;
	}

	public void setDebitCheck(boolean debitCheck) {
		this.debitCheck = debitCheck;
	}

	public boolean isNetBankingCheck() {
		return netBankingCheck;
	}

	public void setNetBankingCheck(boolean netBankingCheck) {
		this.netBankingCheck = netBankingCheck;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userTitle=" + userTitle + ", userFirstName=" + userFirstName
				+ ", userMiddleName=" + userMiddleName + ", userLastName=" + userLastName + ", userPhnNo=" + userPhnNo
				+ ", userEmail=" + userEmail + ", userAadhaar=" + userAadhaar + ", userDob=" + userDob + ", resAddress="
				+ resAddress + ", resCity=" + resCity + ", resState=" + resState + ", resZip=" + resZip
				+ ", perAddress=" + perAddress + ", perCity=" + perCity + ", perState=" + perState + ", perZip="
				+ perZip + ", userOccuType=" + userOccuType + ", userIncomeSource=" + userIncomeSource
				+ ", userGrossIncome=" + userGrossIncome + ", debitCheck=" + debitCheck + ", netBankingCheck="
				+ netBankingCheck + ", applicationStatus=" + applicationStatus + "]";
	}
	
	
	
}







