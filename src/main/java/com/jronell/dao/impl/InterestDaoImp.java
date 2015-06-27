package com.jronell.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jronell.dao.InterestDao;
import com.jronell.jdbc.ConnectionManager;
import com.jronell.model.Interest;
import com.jronell.model.User;

public class InterestDaoImp implements InterestDao {

	@Override
	public void addInterest(Interest interest) {
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
	public void updateInterest(Interest interest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteInterest(Interest interest) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Interest> getUserInterestList(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Interest> getInterestList() {
		// TODO Auto-generated method stub
		return null;
	}

}
