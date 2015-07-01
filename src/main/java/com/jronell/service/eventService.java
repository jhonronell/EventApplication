package com.jronell.service;

import java.util.ArrayList;

import com.jronell.model.Event;

public interface EventService {

	

	public void deleteEvent(int eventId);
	
	public void getAllEvents();
	
	public void getUserEvents(int userId);
	
	public void getInterestEvents(int interestId);
	
	public void getEventDates(int interestId);
	
	public void executeEventQuery();

	public void addEvent(Event event);
	
}
