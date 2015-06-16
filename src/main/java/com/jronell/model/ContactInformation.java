package com.jronell.model;

public class ContactInformation {
	
	private String emailAddress;
	private String phoneNumber;
	private String landline;
	private String officeNumber;
	
	
	public ContactInformation(String emailAddress,String phoneNumber,String landline, String officeNumber){
		
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.landline = landline;
		this.officeNumber = officeNumber;
		
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLandline() {
		return landline;
	}
	public void setLandline(String landline) {
		this.landline = landline;
	}
	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	
	

	
}
