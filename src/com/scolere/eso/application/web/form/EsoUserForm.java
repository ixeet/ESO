package com.scolere.eso.application.web.form;

import java.io.File;


public class EsoUserForm {
	
	int userId;
	String userName;
	String emailId;
	String userPassword;
	String fname;
	String lname;
	String companyName;
	String dob;
	String contactNo;
	String confirmPassword;
	
	String address;
	String address2;
	String city;
	String state;
	String zip;
	String country;
	int loginFlag;
	
    File userImage;
    String userImageContentType;
    String userImageFileName;
    
    String homeContactNo;
    String website;
    
    int[] interestId;
    String otherInterestName;
    
    String addedEmailId;
    String addedPassword;
    String addedUsername;
    

	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLoginFlag() {
		return loginFlag;
	}
	public void setLoginFlag(int loginFlag) {
		this.loginFlag = loginFlag;
	}
	public File getUserImage() {
		return userImage;
	}
	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}
	public String getUserImageContentType() {
		return userImageContentType;
	}
	public void setUserImageContentType(String userImageContentType) {
		this.userImageContentType = userImageContentType;
	}
	public String getUserImageFileName() {
		return userImageFileName;
	}
	public String getOtherInterestName() {
		return otherInterestName;
	}
	public void setOtherInterestName(String otherInterestName) {
		this.otherInterestName = otherInterestName;
	}
	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}
	public int[] getInterestId() {
		return interestId;
	}
	public void setInterestId(int[] interestId) {
		this.interestId = interestId;
	}
	public String getHomeContactNo() {
		return homeContactNo;
	}
	public void setHomeContactNo(String homeContactNo) {
		this.homeContactNo = homeContactNo;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getAddedEmailId() {
		return addedEmailId;
	}
	public void setAddedEmailId(String addedEmailId) {
		this.addedEmailId = addedEmailId;
	}
	public String getAddedPassword() {
		return addedPassword;
	}
	public void setAddedPassword(String addedPassword) {
		this.addedPassword = addedPassword;
	}
	public String getAddedUsername() {
		return addedUsername;
	}
	public void setAddedUsername(String addedUsername) {
		this.addedUsername = addedUsername;
	}

	
	
}
