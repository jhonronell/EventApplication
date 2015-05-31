package com.jronell.domain;

public class Address{
	
	private String street;
	private String brgy;
	private String city;
	private String town;
	private String region;
	private String province;
	private String country; 
		
	public Address(String street, String brgy, 
			String city, String town, String region, 
			String province, String country){
		
		this.street = street;
		this.brgy = brgy;
		this.city = city;
		this.town = town;
		this.region = region;
		this.province = province;
		this.country = country;
		
	}
	
}
