package com.jronell.model;

import java.util.List;

public class User {

	public enum UserType{ CLIENT, ADMIN };
	public enum Gender { MALE, FEMALE;
	
		
	}
	public Gender checkGender(String gender){
		
		if(gender.equalsIgnoreCase(Gender.MALE.toString())){
			return Gender.MALE;
		}
		return Gender.FEMALE;
	}
	
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
	private String dateOfBirth;
	private int age;
	private  int id;
	
	private String username; 
	private String password;
	
	private EventAddress address;
	private ContactInformation contactInformation;
	private Status status;
	private UserType userType;
	private List<Interest> interestList; 
	private String shoutOut;
	private List<Event> events;
	private List<BucketListItem> bucketList;
	
	public void setBucketList(List<BucketListItem> bucketList){
		this.bucketList = bucketList;
	};
	public List<BucketListItem> getBucketList(){
		return this.bucketList;
	};
	
	public int getUserId(){
		return this.id;
	}
	public void setUserId(int userId){
		this.id = userId;
	}
	
	public void addUserPersonalInformation(int id, String firstName, String lastName, String middleName, Gender gender,
			String dateOfBirth, int age)
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

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public UserType getUserType() {
		return userType;
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

	public String getDateOfBirth() {
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
		return this.id;
	}

	public EventAddress getAddress() {
		return address;
	}

	public List<Interest> getInterest() {
		return interestList;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setInterestList(List<Interest> interestList)
	{
		this.interestList = interestList;
	}
	
	public void setEvents(List<Event> events) {
		// TODO Auto-generated method stub
		this.events = events;
	}
	public List<Event> getEvents() {
		// TODO Auto-generated method stub
		return this.events;
	}
	public List<Interest> getInterestList(){
		// TODO Auto-generated method stub
		return this.interestList;
	}

}
