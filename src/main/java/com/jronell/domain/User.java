package com.jronell.domain;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;



public class User {

	enum UserType{ CLIENT, ADMIN };
	
	enum Gender { MALE, FEMALE } 
	
	private String firstName;
	private String lastName;
	private String middleName;
	private Gender gender;
	private Date dateOfBirth;
	private int age;
	private final int id;
	
	private String username; 
	private String password;
	
	private Address address;
	private ContactInformation contactInformation;
	private Status status;
	private UserType userType;
	private InterestList interest; 
	private EventList events;
	
	
	public User(int id){
		this.id = id;
	}
	
	public void addUserPersonalInformation(int id, String firstName, String lastName, String middleName, Gender gender,
			Date dateOfBirth, int age)
	{
		this.firstName  = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		
	}
	public void setCredentials(String username,String password, UserType userType, Status status){
		
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.status = status;
		
		
	}
	public void setAddress(Address address){
		this.address = address;
	}
	public void setcontactInformation(ContactInformation contactInformation){
		this.contactInformation = contactInformation;
	}

	public void setInterest(InterestList newInterestList) {
		// TODO Auto-generated method stub
		this.interest = newInterestList;
	}

	public EventList getEvents() {
		return events;
	}

	public void setEvents(EventList events) {
		this.events = events;
	}

	public Status getStatus() {
		// TODO Auto-generated method stub
		return this.status;
	}
	

	
	public StringBuilder displayUserInfo(){
	
		StringBuilder userInfo = new StringBuilder();
		
		userInfo.append(this.firstName + " " + this.lastName +  "Is registered " +
		                this.username + "with " + this.password + "Password" );
		              
		
		return userInfo;
	}

	public void getInterestList() {
		// TODO Auto-generated method stub
		 for(Interest i:  interest.getInterestList()){
			 System.out.println(i.getInterestName());
		 }
	}
	
}
