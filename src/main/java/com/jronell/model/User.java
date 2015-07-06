package com.jronell.model;

import java.util.ArrayList;
import java.util.Date;

public class User {

	public enum UserType{ CLIENT, ADMIN };
	public enum Gender { MALE, FEMALE } 
	
	private String firstName;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String lastName;
	private String middleName;
	private Gender gender;
	private Date dateOfBirth;
	private int age;
	private  int id;
	
	private String username; 
	private String password;
	
	private EventAddress address;
	private ContactInformation contactInformation;
	private Status status;
	private UserType userType;
	private InterestList interestList; 
	private String shoutOut;
	
	
	public int getUserId(){
		return this.id;
	}
	
	
	public void addUserPersonalInformation(int id, String firstName, String lastName, String middleName, Gender gender,
			Date dateOfBirth, int age)
	{
		this.firstName  = firstName;
		this.lastName = lastName;
		this.setMiddleName(middleName);
		this.setGender(gender);
		this.setDateOfBirth(dateOfBirth);
		this.setAge(age);
		
	}
	public StringBuilder displayUserInfo(){
	
		StringBuilder userInfo = new StringBuilder();
		userInfo.append(this.firstName + " " + this.lastName +  "Is registered " +
		                this.username + "with " + this.password + "Password" );
		return userInfo;
	}

	public void setCredentials(String username,String password, UserType usertype, Status status){
		this.username = username;
		this.password = password;
		this.setUserType(usertype);
		this.status = status;		
	}
	public void setAddress(EventAddress address){
		this.address = address;
	}
	public void setcontactInformation(ContactInformation contactInformation){
		this.setContactInformation(contactInformation);
	}

	public void setInterest(InterestList newInterestList) {
		// TODO Auto-generated method stub
		this.interestList = newInterestList;
	}



	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public UserType getUserType() {
		return userType;
	}

	public void getInterestList() {
		// TODO Auto-generated method stub
		 for(Interest i:  interestList.getInterestList()){
			 System.out.println(i.getName());
		 }
	}

	public String getUsername()
	{	
		return this.username;
	}

	public ContactInformation getContactInformation() {
		return contactInformation;
	}

	public String getMiddleName() {
		return middleName;
	}

	public Gender getGender() {
		return gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public Status getStatus() {
		// TODO Auto-generated method stub
		return this.status;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public EventAddress getAddress() {
		return address;
	}

	public InterestList getInterest() {
		return interestList;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
