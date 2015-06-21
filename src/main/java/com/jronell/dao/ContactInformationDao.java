package com.jronell.dao;

import java.util.Collection;

import com.jronell.model.Event;
import com.jronell.model.EventType;

public interface ContactInformationDao {

	
	public void addContactInformation(ContactInformationDao contactInfo); 
	
	public void updateContactInformation(ContactInformationDao contactInfo); 
	
	public Event getContactInformation(String eventID);
	
	public Collection<Event> getContactInformations(EventType eventType);
	
	
	
}
