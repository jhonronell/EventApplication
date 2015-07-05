package com.jronell.service;


import com.jronell.dao.UserDao;
import com.jronell.model.Address;
import com.jronell.model.Interest;
import com.jronell.model.User;

public interface UserService {
	
	public void setUserDao(UserDao userDao);
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void updateUserAddress(Address userAddress);
	
	public void deleteUser(int userId);
	
	
	
	

}
