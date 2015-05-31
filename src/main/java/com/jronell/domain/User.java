package com.jronell.domain;

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
	
	User(int id){
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
	public void addCredentials(String username,String password){
		
		this.username = username;
		this.password = password;
	}
	public void addAddress(Address address){
		this.address = address;
	}
	public void addcontactInformation(ContactInformation contactInformation){
		this.contactInformation = contactInformation;
	}

	public void addInterest(InterestList newInterestList) {
		// TODO Auto-generated method stub
		this.interest = newInterestList;
	}
	

	
	
}
