package com.jronell.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Event {
	
	private int eventId;
	public EventAddress address;
	private EventType type;
	private String name;
	private String additionalDetails;
	private String description;
	private String eventStartDate; 
	private String eventEndDate;
	private String datePosted; 
	private Status status;
	private int organizerId;
	
	
	private ArrayList<User> participants  = new ArrayList<User>();

	public String getDescription(){
		return this.description;
	}
	public void setDescrition(String description){
		this.description = description;
	}
	public String getAdditionalDetails(){
		return this.additionalDetails;
	}
	public void setAdditionalDetails(String additionalDetails){
		this.additionalDetails = additionalDetails;
	}
	public void setOrganizerId(int organizerId){
		this.organizerId = organizerId;
	}
	
	public void setAddress(EventAddress address){
		
		this.address = address;
	}
	
	public int getEventId() {
		return this.eventId;
	}
	
	public Event( EventType eventType, String name, String eventStartDate,
			String eventEndDate, String datePosted, Status status,int organizerId ){
	
		this.type = eventType;
		this.name = name;
		this.eventEndDate = eventEndDate;
		this.datePosted = datePosted;
		this.eventStartDate = eventStartDate;
		this.status = status;
		this.organizerId = organizerId;
		
	}
	
	
	public Event( EventType eventType, String name, String eventStartDate,
			String eventEndDate, String datePosted, Status status,String description ){
	
		this.type = eventType;
		this.name = name;
		this.eventEndDate = eventEndDate;
		this.datePosted = datePosted;
		this.eventStartDate = eventStartDate;
		this.status = status;
		this.description = description;
		
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public EventAddress getAddress() {
		return this.address;
	}
	public EventType getType() {
		return this.type;
	}


	public String getName() {
		return this.name;
	}


	public String getEventStartDate() {
		return this.eventStartDate;
	}


	public String getEventEndDate() {
		return this.eventEndDate;
	}


	public String getDatePosted() {
		return this.datePosted;
	}


	public Status getStatus() {
		return this.status;
	}


	public int getOrganizerId() {
		System.out.println(this.organizerId);
		return this.organizerId;
	}






	public void enlistParticipant(User user){
		
		participants.add(user);
		
	}
	
	
	
	
	
	
}


