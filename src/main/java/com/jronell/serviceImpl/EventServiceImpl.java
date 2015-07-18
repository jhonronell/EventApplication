package com.jronell.serviceImpl;

import java.util.List;

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
	public int addEvent(Event event) {
		// TODO Auto-generated method stub
	   return eventDao.addEvent(event);
	}

	@Override
	public void deleteEvent(int eventId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Event> getAllEvents() {

		return eventDao.getEvents();
		// TODO Auto-generated method stub
	}



	public void setEventDao(EventDao eventDao) {
		this.eventDao = eventDao;
	}

	@Override
	public List<Event> getEventByUserId(int userId) {
		// TODO Auto-generated method stub
		
		return eventDao.getEvents(userId);
	}
	


}
