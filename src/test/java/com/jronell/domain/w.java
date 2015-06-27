package com.jronell.domain;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.jronell.jdbc.ConnectionManager;

public class w {

	@Test
public void testdb(){
		
		
		Statement stmt = null;
		ResultSet rs = null;

		try {

		    //
		    // Create a Statement instance that we can use for
		    // 'normal' result sets assuming you have a
		    // Connection 'conn' to a MySQL database already
		    // available
			ConnectionManager conManager = new ConnectionManager();	
			Connection conn;
			try {
				conn = conManager.getConnection();
				   stmt = conn.createStatement();
				/*   stmt.executeUpdate("DROP TABLE IF EXISTS autoIncTutorial");
				    stmt.executeUpdate(
				            "CREATE TABLE autoIncTutorial ("
				            + "priKey INT NOT NULL AUTO_INCREMENT, "
				            + "dataField VARCHAR(64), PRIMARY KEY (priKey))");*/
				    
				    stmt.executeUpdate(
				            "INSERT INTO autoIncTutorial (dataField) "
				            + "values ('Can I Get the Auto Increment Field?')",
				            Statement.RETURN_GENERATED_KEYS);
				    
				    int autoIncKeyFromApi = -1;

				    rs = stmt.getGeneratedKeys();

				    if (rs.next()) {
				        autoIncKeyFromApi = rs.getInt(1);
				    } else {

				        // throw an exception from here
				    }

				    System.out.println("Key returned from getGeneratedKeys():"
				        + (autoIncKeyFromApi + 1));
				    
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 

		    //
		    // Issue the DDL queries for the table for this example
		    //

		 

		    //
		    // Insert one row that will generate an AUTO INCREMENT
		    // key in the 'priKey' field
		    //

		

		    //
		    // Example of using Statement.getGeneratedKeys()
		    // to retrieve the value of an auto-increment
		    // value
		    //

		
		} finally {

		    if (rs != null) {
		        try {
		            rs.close();
		        } catch (SQLException ex) {
		            // ignore
		        }
		    }

		    if (stmt != null) {
		        try {
		            stmt.close();
		        } catch (SQLException ex) {
		            // ignore
		        }
		    }
		}
		
	}

}
