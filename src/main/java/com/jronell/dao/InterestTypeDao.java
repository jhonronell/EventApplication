package com.jronell.dao;

import java.util.ArrayList;

import com.jronell.model.Interest;
import com.jronell.model.User;

public interface InterestTypeDao {

	public void addInterestType(InterestType interestType);
	
	public void updateInterestType(InterestType interest);
	
	public void deleteInterestType(InterestType interest);
	
	public ArrayList<Interest> getInterestList();
	
}

