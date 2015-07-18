package com.jronell.model;

public class BucketListItem {
	int id;
	String name; 
	String region;
	String town;
	String city;
	int userId;
	String dateAdded;
	
	
	public BucketListItem(int id, String name, String region, String town,
			String city, int userId, String dateAdded) {
		this.id = id;
		this.name = name;
		this.region = region;
		this.town = town;
		this.city = city;
		this.userId = userId;
		this.dateAdded = dateAdded;
	}
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRegion() {
		return region;
	}

	public String getTown() {
		return town;
	}

	public String getCity() {
		return city;
	}

	public int getUserId() {
		return userId;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}



}
