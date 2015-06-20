package com.jronell.domain;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.jronell.dao.impl.EventDaoImpl;
import com.jronell.model.Address;
import com.jronell.model.ContactInformation;
import com.jronell.model.Event;
import com.jronell.model.EventType;
import com.jronell.model.Status;
import com.jronell.model.User;

public class EventDaoTest {

	@Test
	public void InsertDataToDB() {
		
		
		//Address address = new Address("San Lorenzo","Kapitolyo","Pasig","boystown","NCR","Manila","PH");
		
		User user1 = new User(1);
	
		Event event1 = new Event( EventType.DIY , "2002-10-09", "2002-10-09", "2002-10-09", "2002-10-09", Status.ACTIVE , user1.getUserId() );
		
		EventDaoImpl eventDao = new EventDaoImpl();
		eventDao.addEvent( event1  );
		
		
	}

}
