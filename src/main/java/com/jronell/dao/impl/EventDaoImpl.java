package com.jronell.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

import com.jronell.dao.EventDao;
import com.jronell.jdbc.ConnectionManager;
import com.jronell.model.Event;
import com.jronell.model.EventType;

public class EventDaoImpl implements EventDao {

	
	@Override
	public void addEvent(Event event) {
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
	public Collection<Event> getEvents(EventType eventType) {
		// TODO Auto-generated method stub
		return null;
	}

}
