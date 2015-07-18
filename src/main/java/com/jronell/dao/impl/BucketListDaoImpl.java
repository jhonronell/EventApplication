package com.jronell.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jronell.dao.BucketListDao;
import com.jronell.jdbc.ConnectionManager;
import com.jronell.model.BucketListItem;

public class BucketListDaoImpl implements BucketListDao {
	@Override
	public void addItemInBucketList(BucketListItem bucketList) {
		// TODO Auto-generated method stub

	}
	@Override
	public void deleteItemInBucketList(int bucketListItemId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BucketListItem> getUserBucketList(int userId) {
		// TODO Auto-generated method stub
		List<BucketListItem> bucketList = new ArrayList<BucketListItem>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionManager conManager = new ConnectionManager();
			Connection conn = conManager.getConnection();
			Statement myStatement = conn.createStatement();
			String sql = "SELECT * FROM hopIn.BucketList where userId=" + userId;
		    ResultSet rs = myStatement.executeQuery(sql);
		    System.out.println(sql);
		    while(rs.next()){
		         int id = rs.getInt("id");  
		         String name = rs.getString("name");  
		         BucketListItem bucketListItem = new BucketListItem(id, name, name,name, name, id, name);
		         System.out.println( bucketListItem.getName() );
		         bucketList.add(bucketListItem);	         
		    }
		    rs.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bucketList;
	}

}
