package com.jronell.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import com.jronell.dao.InterestTypeDao;
import com.jronell.jdbc.ConnectionManager;
import com.jronell.model.Event;
import com.jronell.model.EventType;
import com.jronell.model.InterestType;
import com.jronell.model.Status;

public class InterestTypeDaoImpl implements InterestTypeDao {

	@Override
	public void addInterestType(InterestType interestType) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionManager conManager = new ConnectionManager();
			Connection conn = conManager.getConnection();
			Statement myStatement = conn.createStatement();
		
			String query = "INSERT INTO hopIn.InterestType (id, name, suggestedBy) "
					 	 + "	VALUES(0, '" + interestType.getName() + "', '"+ interestType.getUserId() + "'); ";
			
			myStatement.executeUpdate(query);
	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}

	}

	@Override
	public void updateInterestType(InterestType interest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteInterestType(InterestType interest) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<InterestType> getInterestTypeList() {
	
		List<InterestType> interestTypeList = new ArrayList<InterestType>(); 
		
		try {
			
			ConnectionManager conManager = new ConnectionManager();
			Connection conn = conManager.getConnection();
			
			Statement myStatement = conn.createStatement();
			
			String sql = "SELECT * FROM hopIn.InterestType;";
		    ResultSet rs = myStatement.executeQuery(sql);
		    
		    while(rs.next()){
		    	
		    	
		    	
		    	 int id = rs.getInt("id");
		         String name = rs.getString("name");  
		         
		         InterestType interestType =  new InterestType(name,id);
		         
		         interestTypeList.add(interestType);
		         
		    }
		    rs.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		return interestTypeList;
	}

	

}
