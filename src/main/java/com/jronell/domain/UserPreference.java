package com.jronell.domain;

import java.util.HashSet;
import java.util.Set;

public class UserPreference {
	
	 Set<UserPreference> preferences = new HashSet<>();

     public void addUserPreference(UserPreference preferenceId) {
    	 preferences.add(preferenceId);
     }
	
}
