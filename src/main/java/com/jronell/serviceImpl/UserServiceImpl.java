package com.jronell.serviceImpl;


import com.jronell.dao.UserDao;
import com.jronell.model.Address;
import com.jronell.model.Interest;
import com.jronell.model.InterestType;
import com.jronell.model.User;
import com.jronell.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserAddress(Address userAddress) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
}
