package com.jronell.serviceImpl;

import com.jronell.dao.AuthenticationDao;
import com.jronell.model.User;
import com.jronell.service.AuthenticationService;

public class AuthenticationServiceImpl implements AuthenticationService {

	
	private AuthenticationDao authenticationDao;
	
	public void setAuthenticationDao(AuthenticationDao authenticationDao){
		this.authenticationDao = authenticationDao;
	}
	
	@Override
	public User validateUser(String username, String password) {
		return authenticationDao.validate(username, password);
	}

	@Override
	public void retrievePassword(String username) {
		// TODO Auto-generated method stub

	}

}
