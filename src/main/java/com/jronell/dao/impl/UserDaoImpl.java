package com.jronell.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jronell.dao.UserDao;
import com.jronell.jdbc.ConnectionManager;
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
			   
		/*	String query = "INSERT INTO hopIn.User (firstName, middleName, lastName, gender, dateOfBirth, age, username, password, status, userType) "
			+ "VALUES('" + user.getFirstName()  + "', '" + user.getMiddleName()  + "', "
					+ "'" + user.getLastName()  + "', ''" + user.getGender()  + "',"
					+ "'" + user.getDateOfBirth()  + "', '" + user.getAge()  + "', "
					+ "'" + user.getUsername()  + "', '" + user.getPassword()  + "',"
					+ " '" + user.getStatus()  + "', '" + user.getUserType() + "');";*/
			
			String query = "INSERT INTO hopIn.User (firstName, middleName, lastName ) "
					+ "VALUES('" + user.getFirstName()  + "', '" + user.getMiddleName()  + "', "
							+ "'" + user.getLastName() + "');";
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
	public void getUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		
	}

}
