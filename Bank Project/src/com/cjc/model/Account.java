package com.cjc.model;

public class Account {
	
	private double acNo;
	private String acName;
	private String address;
	private long mobileNo;
	private long adharNo;
	private String panNo;
	private double balance;
	private String gender;
	private long userId;
	private String password;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAcNo() {
		return acNo;
	}
	public void setAcNo(double acNo) {
		this.acNo = acNo;
	}
	public String getAcName() {
		return acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Account Holder No :" + acNo + "\n Account Holder Name :" + acName + "\n Account Holder Address :" + address + "\n Account Holder MobileNo :" + mobileNo
				+ "\n Account Holder AdharNo :" + adharNo + "\n Account Holder PanNo=" + panNo + "\n Account Holder Balance :" + balance + "\n Account Holder Gender :" + gender;
	}
	
	

}
