package com.jronell.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.jronell.model.EventAddress;
import com.jronell.model.Event;

import com.jronell.model.EventType;

public interface EventDao {


	
	
	public int addEvent(Event event); 
	
	public void updateEvent(Event event); 
	
	public void deleteEvent(int eventId);
	
	public Event getEvent(int eventID);
	
	public List<Event> getEvents(EventType eventType);

	public List<Event> getEvents();

	public List<Event> getEvents(int userId);
	
}
