package com.jronell.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.jronell.dao.EventDao;
import com.jronell.jdbc.ConnectionManager;
import com.jronell.model.EventAddress;
import com.jronell.model.Event;
import com.jronell.model.EventType;
import com.jronell.model.Status;

public class EventDaoImpl implements EventDao {

	
	
	
	@Override
	public void addEvent(Event event) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionManager conManager = new ConnectionManager();
			Connection conn = conManager.getConnection();
			Statement myStatement = conn.createStatement();
			ResultSet rs = null;
			   
			String query = "INSERT INTO hopIn.Events ( type, name, startDate, endDate, datePosted, status, organizing_user,id)"
				 	 + "VALUES("
				 	 + " '" + event.getType()  + "',"
				 	 + " '" + event.getName()  + "',"
				 	 + " '" + event.getEventStartDate()  + "',"
				 	 + " '" + event.getEventEndDate()  + "',"
				 	 + " '" + event.getDatePosted()  + "',"
				 	 + " '" + event.getStatus()  + "'"
				 	 + ",'" + event.getOrganizingUser()  + "',0)";
			System.out.println(query);
			
			myStatement.executeUpdate(query,   Statement.RETURN_GENERATED_KEYS);
		    
		    int autoIncKeyFromApi = -1;

		    rs = myStatement.getGeneratedKeys();

		    if (rs.next()) {
		        autoIncKeyFromApi = rs.getInt(1);
		    } else {

		        // throw an exception from here
		    }
		    
		    event.setEventId( autoIncKeyFromApi );
			
			AddressDaoImpl addressDao = new AddressDaoImpl();
			//not sure if this is code smell
			event.address.setEventId(autoIncKeyFromApi);
			addressDao.addEventAddress(  event.getAddress() );
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		
		}
				
	}

	@Override
	public void updateEvent(Event event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEvent(String eventId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Event getEvent(String eventID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Event> getEvents() {
		
		ArrayList<Event> eventList = new ArrayList<Event>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionManager conManager = new ConnectionManager();
			Connection conn = conManager.getConnection();
			Statement myStatement = conn.createStatement();
			
			String sql = "SELECT * FROM hopIn.events;";

		    ResultSet rs = myStatement.executeQuery(sql);
		    System.out.println(sql);
		    while(rs.next()){
		    	
		    	System.out.println(rs.getString("type"));
		    	
		     
		         EventType type = EventType.validate(rs.getString("type")); 
		         String name = rs.getString("name");  
		         String eventStartDate = rs.getString("startDate");  
		         String eventEndDate = rs.getString("endDate");  
		         String datePosted = rs.getString("datePosted");
		         Status status = Status.validate( rs.getString("status") ); 
		         int organizing_user = rs.getInt("organizing_user");
			 	 
		         Event newEventRs = new Event(type, name, eventStartDate, eventEndDate, datePosted, status, organizing_user);
		         eventList.add(newEventRs);
		         
		    }
		    rs.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		return eventList;
	}

	@Override
	public Collection<Event> getEvents(EventType eventType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEvent(Event event,EventAddress addresss) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionManager conManager = new ConnectionManager();
			Connection conn = conManager.getConnection();
			Statement myStatement = conn.createStatement();
			   
			String query = "INSERT INTO hopIn.events ( type, name, startDate, endDate, datePosted, status, organizing_user)"
				 	 + "VALUES("
				 	 + " '" + event.getType()  + "',"
				 	 + " '" + event.getName()  + "',"
				 	 + " '" + event.getEventStartDate()  + "',"
				 	 + " '" + event.getEventEndDate()  + "',"
				 	 + " '" + event.getDatePosted()  + "',"
				 	 + " '" + event.getStatus()  + "'"
				 	 + ",'" + event.getOrganizingUser()  + "')";
			
			System.out.println(query);
			myStatement.executeUpdate(query);
			
		
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		
		}
	}

}
