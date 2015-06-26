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
	
	private String eventStartDate; 
	private String eventEndDate;
	private String datePosted; 
	private Status status;
	private int organizingUser;
	
	private ArrayList<String> categoryList = new ArrayList<>();
	
	private Set<User> participants  = new HashSet<>();

	public void setAddress(EventAddress address){
		
		this.address = address;
	}
	
	public Event(EventAddress address, EventType type, String name, String eventStartDate,
				String eventEndDate, String datePosted, Status status, int userId ){
		
		this.address = address;
		this.type = type;
		this.name = name;
		this.eventEndDate = eventEndDate;
		this.datePosted = datePosted;
		this.eventStartDate = eventStartDate;
		this.status = status;
		this.organizingUser = userId;
	
		
	}
	
	public int getEventId() {
		return this.eventId;
	}
	public Event( EventType eventType, String name, String eventStartDate,
			String eventEndDate, String datePosted, Status status, int userId ){
	
		this.organizingUser = userId;
		this.type = eventType;
		this.name = name;
		this.eventEndDate = eventEndDate;
		this.datePosted = datePosted;
		this.eventStartDate = eventStartDate;
		this.status = status;
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


	public int getOrganizingUser() {
		System.out.println(this.organizingUser);
		return this.organizingUser;
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


