package com.jronell.dao;

import com.jronell.model.User;

public interface UserDao {

	public User getUser(int userId);

	void addUser(User user);
	
	void deleteUser(int userId);

	
}
