package com.jronell.service;

import com.jronell.model.User;

public interface AuthenticationService {
	
	void retrievePassword(String username);

	User validateUser(String username, String password);
	
}
