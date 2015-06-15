package com.jronell.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Event {
	
	
	private int eventId;
	private Address address;
	private EventType type;
	private String name;
	
	private Date eventStartDate; 
	private Date eventEndDate;
	private Date datePosted; 
	private Status status;
	private User author;
	
	private ArrayList<String> categoryList = new ArrayList<>();
	
	private Set<User> participants  = new HashSet<>();

	
	public void enlistParticipant(User user){
		
		participants.add(user);
		
	}
	
	
	
	
	
	
}


