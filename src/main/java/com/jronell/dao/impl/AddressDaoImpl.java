package com.jronell.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

import com.jronell.dao.EventAddressDao;
import com.jronell.jdbc.ConnectionManager;
import com.jronell.model.EventAddress;

public class AddressDaoImpl implements EventAddressDao {

	@Override
	public void addEventAddress(EventAddress address) {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.jdbc.Driver");
		ConnectionManager conManager = new ConnectionManager();
		Connection conn = conManager.getConnection();
		Statement myStatement = conn.createStatement();
		   
		String insertQuery = "INSERT INTO hopIn.EventAddress"
				+ "(id, street, brgy, city, town, region, province, country, state, isActive,eventId)"
				+ "VALUES('"  + address.getAddressId()  + "',"
						+ "'" + address.getStreet()  + "', "
						+ "'" + address.getBrgy()  + "', "
						+ "'" + address.getCity()  + "',"
						+ "'" + address.getTown()  + "',"
						+ "'" + address.getRegion()  + "',"
						+ "'" + address.getProvince()  + "',"
						+ "'" + address.getCountry()  + "', "
						+ "'" + address.getState()  + "',"
						+ "'" + address.isActive()  + "',"
						+ "'" + address.getEventId() + "');";
		System.out.println(insertQuery);
		myStatement.executeUpdate(insertQuery);
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		
		}
			
	}

	@Override
	public void updateAddress(EventAddress address) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public Collection<EventAddress> listAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<EventAddress> listUserAddress() {
		// TODO Auto-generated method stub
		return null;
	}

}
