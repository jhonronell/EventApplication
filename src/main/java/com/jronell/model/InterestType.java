package com.jronell.model;

import java.util.ArrayList;

public class InterestType {

	private String name;
	private int id;
	private int userId;
	private String status;
	
	

	public InterestType(String name){
		this.name = name;
	}
	public InterestType(String name,int id){
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		// TODO Auto-generated method stub
		return this.userId;
	}
	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setUserId(int userId2) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	
}
