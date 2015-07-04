package com.jronell.serviceImpl;

import com.jronell.dao.EventDao;
import com.jronell.dao.impl.EventDaoImpl;
import com.jronell.model.Event;
import com.jronell.model.EventAddress;
import com.jronell.model.User;
import com.jronell.service.EventService;

public class EventServiceImpl implements EventService {

	//public ArrayList<Event> eventList = new ArrayList<Event>();
	private EventDao eventDao;

	@Override
	public void addEvent(Event event) {
		// TODO Auto-generated method stub
		
		User user1 = new User();
	   	int organizerId = user1.getUserId();
	   	
	    EventAddress address = new EventAddress("San Lorenzo","Kapitolyo","Pasig","boystown","NCR","Manila","PH", null);
	    event.setAddress(address);
	    event.setOrganizingUser(organizerId);
	    
		
	   	eventDao.addEvent(event);
	  
	}

	@Override
	public void deleteEvent(int eventId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAllEvents() {
		// TODO Auto-generated method stub

	}



	@Override
	public void getUserEventByUserId(int userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getUserEventByOrganizerid(int organizerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEventsByInterest(int interestId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEventByDate(String date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEventByDateRange(String dateFrom, String dateTo) {
		// TODO Auto-generated method stub
		
	}

	public void setEventDao(EventDao eventDao) {
		this.eventDao = eventDao;
	}
	


}
