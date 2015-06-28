package com.jronell.dao;

public class InterestType {
	
	String name; 
	int userId;
	private String status;
	
	
	public void  setName(String name){
		
		this.name = name;
		
	}
	public String getName(){
		
		return this.name;
	}
	public int getUserId() {
		// TODO Auto-generated method stub
		return userId;
	}
	public void setStatus(String status) {
		// TODO Auto-generated method stub
		this.status = status;
	}
	public void setUserId(int userId) {
		// TODO Auto-generated method stub
		this.userId  = userId;
	}

}
