package com.jronell.jdbc;

import java.sql.*;
import java.util.Properties;

public class ConnectionManager {

	private Object userName = "root";
	private Object password = "root";
	private String dbms = "mysql";
	private String serverName = "192.168.56.102";
	private String dbName = "hopIn";

	public Connection getConnection() throws SQLException, ClassNotFoundException {

	    Connection conn = null;
	    Properties connectionProps = new Properties();
	    connectionProps.put("user", this.userName);
	    connectionProps.put("password", this.password);
	 
	
	    if (this.dbms.equals("mysql")) {
	    	
	    	Class.forName("com.mysql.jdbc.Driver");
	        conn =  DriverManager.getConnection( "jdbc:" + this.dbms + "://" +
	        		this.serverName +  "/" + this.dbName ,  connectionProps);
	   
	    }
	    System.out.println("Connected to database");
	    return conn;
	}
	
	

	
	
}


