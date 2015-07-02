package com.jronell.service;

import java.util.ArrayList;

import com.jronell.model.Event;

public interface EventService {

	
	public void deleteEvent(int eventId);
	
	public void getAllEvents();
	
	public void getUserEventByUserId(int userId);
	
	public void getUserEventByOrganizerid(int organizerId);
	
	public void getEventsByInterest(int interestId);
	
	public void getEventByDate(String date);
	
	public void getEventByDateRange(String dateFrom,String dateTo);
	
	public void addEvent(Event event);
	
}
