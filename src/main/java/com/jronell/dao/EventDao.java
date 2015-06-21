package com.jronell.dao;

import java.sql.Connection;
import java.util.Collection;

import com.jronell.model.Event;
import com.jronell.model.EventType;

public interface EventDao {


	
	
	public void addEvent(Event event); 
	
	public void updateEvent(Event event); 
	
	public void deleteEvent(String eventId);
	
	public Event getEvent(String eventID);
	
	public Collection<Event> getEvents(EventType eventType);
	
}
