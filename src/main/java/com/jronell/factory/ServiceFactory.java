package com.jronell.factory;

import com.jronell.dao.impl.EventDaoImpl;
import com.jronell.service.EventService;
import com.jronell.serviceImpl.EventServiceImpl;

public class ServiceFactory {
    public static EventService createEventService() {
    	EventServiceImpl eventService = new EventServiceImpl();
        eventService.setEventDao(new EventDaoImpl());
         return eventService;
    }
    
 
}

//the service factory create a type from interface of the eventservice then return the 
//event implementation 
