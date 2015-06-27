package com.jronell.model;

public enum EventType {

	PAID,DIY,KKB;

	

	
	
	public static EventType validate(String eventType) {
		// TODO Auto-generated method stub
		
				
		if(eventType.equals(EventType.DIY.toString()) ){
			return EventType.DIY;
		}
		else if(eventType.equals(EventType.PAID.toString()) ){
			return EventType.PAID;
		}
		return null;
	}
}
