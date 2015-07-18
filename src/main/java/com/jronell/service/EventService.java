package com.jronell.service;

import java.util.List;

import com.jronell.dao.EventDao;
import com.jronell.model.Event;

public interface EventService {

	public void setEventDao(EventDao eventDao);
	
	public void deleteEvent(int eventId);
	
	public int addEvent(Event event);
	
	public List<Event> getAllEvents();
	
	public List<Event> getEventByUserId(int userId);
	
	
	
}
