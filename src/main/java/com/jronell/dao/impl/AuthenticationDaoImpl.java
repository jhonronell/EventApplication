package com.jronell.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jronell.dao.AuthenticationDao;
import com.jronell.jdbc.ConnectionManager;
import com.jronell.model.Event;
import com.jronell.model.EventType;
import com.jronell.model.Status;
import com.jronell.model.User;

public class AuthenticationDaoImpl implements AuthenticationDao {

	boolean status = false;
	@Override
	public User validate(String username, String password) {

		User user = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionManager conManager = new ConnectionManager();
			Connection conn = conManager.getConnection();
			Statement myStatement = conn.createStatement();
			String sql = "SELECT * FROM hopIn.User where username='" + username + "' and password='"+ password +"';";
		    ResultSet rs = myStatement.executeQuery(sql);
		    System.out.println(sql);
		   
		    while(rs.next()){
		    	System.out.println("true");
		    	     
		    	String firstname = rs.getString("firstName");
		    	int userId = rs.getInt("id");
		    	String lastname = rs.getString("lastName");
		    	user = new User();
		        user.setFirstName( firstname );
		        user.setUserId(userId);
		        user.setLastName(lastname);
		        System.out.println(user.getUserId());
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

	
}
