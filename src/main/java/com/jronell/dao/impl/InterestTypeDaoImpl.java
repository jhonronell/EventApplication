package com.jronell.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jronell.dao.InterestType;
import com.jronell.dao.InterestTypeDao;
import com.jronell.jdbc.ConnectionManager;
import com.jronell.model.Interest;

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
	public ArrayList<Interest> getInterestList() {
		// TODO Auto-generated method stub
		return null;
	}

}
