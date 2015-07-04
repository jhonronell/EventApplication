package com.jronell.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jronell.dao.InterestDao;
import com.jronell.jdbc.ConnectionManager;
import com.jronell.model.Event;

import com.jronell.model.EventType;
import com.jronell.model.Interest;
import com.jronell.model.InterestList;
import com.jronell.model.Status;
import com.jronell.model.User;

public class InterestDaoImpl implements InterestDao {

	@Override
	public void addInterest(Interest interest) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionManager conManager = new ConnectionManager();
			Connection conn = conManager.getConnection();
			Statement myStatement = conn.createStatement();
		
			String query = "INSERT INTO hopIn.Interest (id, name, userId, interestTypeId) "
					 	 + "	VALUES(0, '" + interest.getName() + "', '"+ interest.getUserId() + "', '"+ interest.getInterestTypeId() + "'); ";
			
			myStatement.executeUpdate(query);
	
			
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
		
	InterestList interest = new InterestList();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionManager conManager = new ConnectionManager();
			Connection conn = conManager.getConnection();
			Statement myStatement = conn.createStatement();
			
			String sql = "SELECT * FROM hopIn.Interest;";

		    ResultSet rs = myStatement.executeQuery(sql);
		    System.out.println(sql);
		    while(rs.next()){
		    	
		    	System.out.println(rs.getString("type"));
		    	
		         EventType type = EventType.validate(rs.getString("type")); 
		         String name = rs.getString("name");  
		         String eventStartDate = rs.getString("startDate");  
		         String eventEndDate = rs.getString("endDate");  
		         
		       //  Interest interst = new Interest();
		         
		         //interest.addInterest(interest);
		         
		    }
		    rs.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		return null;
		
		
	}

}
