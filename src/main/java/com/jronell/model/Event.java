package com.jronell.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Event {
	
	
	private int eventId;
	public Address address;
	private EventType type;
	private String name;
	
	private String eventStartDate; 
	private String eventEndDate;
	private String datePosted; 
	private Status status;
	private User organizingUser;
	
	private ArrayList<String> categoryList = new ArrayList<>();
	
	private Set<User> participants  = new HashSet<>();

	
	public Event(Address address, EventType type, String name, String eventStartDate,
				String eventEndDate, String datePosted, Status status, int i ){
		
		this.address = address;
		this.type = type;
		this.name = name;
		this.eventEndDate = eventEndDate;
		this.datePosted = datePosted;
		this.eventStartDate = eventStartDate;
		this.status = status;
	
		
	}
	
	public Event( EventType type, String name, String eventStartDate,
			String eventEndDate, String datePosted, Status status, int i ){
	

	this.type = type;
	this.name = name;
	this.eventEndDate = eventEndDate;
	this.datePosted = datePosted;
	this.eventStartDate = eventStartDate;
	this.status = status;
	}
	
	public int getEventId() {
		return eventId;
	}


	public Address getAddress() {
		return address;
	}


	public EventType getType() {
		return type;
	}


	public String getName() {
		return name;
	}


	public String getEventStartDate() {
		return eventStartDate;
	}


	public String getEventEndDate() {
		return eventEndDate;
	}


	public String getDatePosted() {
		return datePosted;
	}


	public Status getStatus() {
		return status;
	}


	public User getOrganizingUser() {
		return organizingUser;
	}


	public ArrayList<String> getCategoryList() {
		return categoryList;
	}


	public Set<User> getParticipants() {
		return participants;
	}


	public void enlistParticipant(User user){
		
		participants.add(user);
		
	}
	
	
	
	
	
	
}


