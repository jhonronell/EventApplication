package com.jronell.model;

public class Interest {
	
	private  String name;
	private int interestTypeId;
	private int userId;
	private String status;
	
	public Interest(String name){
		this.name = name;
	}
	public Interest(String name,int id){
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getInterestTypeId() {
		return interestTypeId;
	}
	
	public void setInterestTypeId(int interestTypeId) {
		this.interestTypeId = interestTypeId;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

}
