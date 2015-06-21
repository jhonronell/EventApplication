package com.jronell.service;

import static org.junit.Assert.assertEquals;

import com.jronell.dao.impl.EventDaoImpl;
import com.jronell.model.Event;
import com.jronell.model.EventType;
import com.jronell.model.Status;
import com.jronell.model.User;

public class eventService {

		
	public void createEvent(){
		User user1 = new User(1);
		
		assertEquals(user1.getUserId(),1);
		Event event1 = new Event( EventType.DIY , "2002-10-09", "2002-10-09", "2002-10-09", "2002-10-09", Status.ACTIVE , user1.getUserId() );
		
		assertEquals(1,event1.getOrganizingUser());
		
		EventDaoImpl eventDao = new EventDaoImpl();
		eventDao.addEvent( event1  );
	
	}
	
	
	
}
