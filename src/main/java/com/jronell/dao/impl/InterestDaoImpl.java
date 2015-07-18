package com.jronell.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jronell.dao.InterestDao;
import com.jronell.jdbc.ConnectionManager;
import com.jronell.model.EventType;
import com.jronell.model.Interest;
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
	public List<Interest> getUserInterestList(int userId) {

		System.out.println(userId + "<---");
		List<Interest> interestList = new ArrayList<Interest>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionManager conManager = new ConnectionManager();
			Connection conn = conManager.getConnection();
			Statement myStatement = conn.createStatement();
			String sql = "SELECT * FROM hopIn.Interest where userId=" + userId  + ";";
		    System.out.println(sql);
		    ResultSet rs = myStatement.executeQuery(sql);
		    while(rs.next()){
		         int id = rs.getInt("id");  
		         String name = rs.getString("name");  
		         Interest interest = new Interest(name,id);
		         interestList.add(interest);	         
		    }
		    rs.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return interestList;
	}

	@Override
	public List<Interest> getInterestList() {
		
		List<Interest> interestList = new ArrayList<Interest>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionManager conManager = new ConnectionManager();
			Connection conn = conManager.getConnection();
			Statement myStatement = conn.createStatement();
			String sql = "SELECT * FROM hopIn.Interest;";
		    ResultSet rs = myStatement.executeQuery(sql);
		    System.out.println(sql);
		    while(rs.next()){
		         int id = rs.getInt("id");  
		         String name = rs.getString("name");  
		         Interest interest = new Interest(name,id);
		         interestList.add(interest);	         
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
