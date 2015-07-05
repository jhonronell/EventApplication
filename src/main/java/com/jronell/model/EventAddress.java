package com.jronell.model;

public class EventAddress extends Address{
	
	private int eventId;
	
	public EventAddress(String street, String brgy, String city, String region, String province){
	
		this.street = street;
		this.brgy = brgy;
		this.city = city;
		this.region = region;
		this.province = province;
		
	}
	
	public void setEventId(int eventId){
		
		this.eventId = eventId;
	}
	
	public int getAddressId() {
		return addressId;
	}

	public String getStreet() {
		return street;
	}

	public String getBrgy() {
		return brgy;
	}

	public String getCity() {
		return city;
	}

	public String getTown() {
		return town;
	}

	public String getRegion() {
		return region;
	}

	public String getProvince() {
		return province;
	}

	public String getCountry() {
		return country;
	}

	public String getState() {
		return state;
	}

	public boolean isActive() {
		return isActive;
	}

	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id =  user_id;
	}
	private int user_id; 
		
	public EventAddress(String street, String brgy, 
			String city, String town, String region, 
			String province, String country, String state	){
		
		this.street = street;
		this.brgy = brgy;
		this.city = city;
		this.town = town;
		this.region = region;
		this.province = province;
		this.country = country;
		
	}

	public int getEventId() {
		// TODO Auto-generated method stub
		return eventId;
	}
	
}
