package com.jronell.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jronell.dao.UserDao;
import com.jronell.jdbc.ConnectionManager;
import com.jronell.model.Event;
import com.jronell.model.EventType;
import com.jronell.model.Status;
import com.jronell.model.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionManager conManager = new ConnectionManager();
			Connection conn = conManager.getConnection();
			Statement myStatement = conn.createStatement();
			ResultSet rs = null;
			   
			String query = "INSERT INTO hopIn.User (firstName, middleName, lastName,gender , dateOfBirth, username, password) "
			+ "VALUES('" + user.getFirstName()  + "', '" + user.getMiddleName()  + "', "
					+ "'" + user.getLastName()  + "', '" + user.getGender()  + "',"
					+ "'" + user.getDateOfBirth()  + "',  "
					+ "'" + user.getUsername()  + "', '" + user.getPassword()  + "');";
					
			
			System.out.println(query);
			
			myStatement.executeUpdate(query,   Statement.RETURN_GENERATED_KEYS);
		    
		    int userId = -1;

		    rs = myStatement.getGeneratedKeys();

		    if (rs.next()) {
		    	userId = rs.getInt(1);
		    } else {

		        // throw an exception from here
		    }
		    System.out.println(userId);
//		    address.setEventId( userId );
//			AddressDaoImpl addressDao = new AddressDaoImpl();
//			//not sure if this is code smell
//			event.address.setEventId(autoIncKeyFromApi);
//			addressDao.addEventAddress(  event.getAddress() );
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		
		}
		

	}

	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		User user = new User();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionManager conManager = new ConnectionManager();
			Connection conn = conManager.getConnection();
			Statement myStatement = conn.createStatement();
			
			String sql = "SELECT * FROM hopIn.User where id='" + userId  + "';";

		    ResultSet rs = myStatement.executeQuery(sql);
		    System.out.println(sql);
		    while(rs.next()){
		    	
		    	 String firstName = rs.getString("firstName");  
		         String lastName = rs.getString("lastName");  
		         String middleName = rs.getString("middleName");
		         
		       
		         user.setFirstName(firstName);
		         user.setLastName(lastName);
		         user.setMiddleName(middleName);
		    }
		    rs.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return user;
	
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		
	}



}
