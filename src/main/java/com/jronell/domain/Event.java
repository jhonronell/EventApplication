package com.jronell.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

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
	
	

}
