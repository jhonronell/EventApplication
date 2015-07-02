package com.jronell.factory;

import com.jronell.dao.EventDao;
import com.jronell.dao.impl.EventDaoImpl;

public class Factory {
 
	public static EventDao getEventDaoImpl(String type) {
	
        if (type.equalsIgnoreCase("EventDao")) {
            return new EventDaoImpl();
        }
		return null;
    }
}