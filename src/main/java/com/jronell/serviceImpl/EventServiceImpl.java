package com.jronell.serviceImpl;

import com.jronell.dao.impl.EventDaoImpl;
import com.jronell.model.Event;
import com.jronell.model.EventAddress;
import com.jronell.model.User;
import com.jronell.service.EventService;

public class EventServiceImpl implements EventService {

	//public ArrayList<Event> eventList = new ArrayList<Event>();
	
	@Override
	public void addEvent(Event event) {
		// TODO Auto-generated method stub
		
		User user1 = new User();
	   	int organizerId = user1.getUserId();
	   	
	    EventAddress address = new EventAddress("San Lorenzo","Kapitolyo","Pasig","boystown","NCR","Manila","PH", null);
	    event.setAddress(address);
	    event.setOrganizingUser(organizerId);
	    
		EventDaoImpl eventDao = new EventDaoImpl();
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
	public void getUserEvents(int userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getInterestEvents(int interestId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getEventDates(int interestId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void executeEventQuery() {
		// TODO Auto-generated method stub

	}

}
