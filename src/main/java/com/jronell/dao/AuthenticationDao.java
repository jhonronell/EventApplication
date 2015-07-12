package com.jronell.dao;

import com.jronell.model.User;

public interface AuthenticationDao {

	public User validate(String username,String password);
	
}
