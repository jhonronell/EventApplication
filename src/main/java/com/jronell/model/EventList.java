package com.jronell.model;

import java.util.ArrayList;

public class EventList {

	ArrayList<Event> eventList = new ArrayList<Event>();
	
	public void addEvent(Event event){
		eventList.add(event);
	}
	public void removeEvent(Event event){
		eventList.remove(event);
	}
	public ArrayList<Event> getEventList(){
		
		return this.eventList;
	
	}
	

}
