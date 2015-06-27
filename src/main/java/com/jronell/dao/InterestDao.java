package com.jronell.dao;

import java.util.ArrayList;
import java.util.Collection;

import com.jronell.model.Interest;
import com.jronell.model.User;

public interface InterestDao {

	public void addInterest(Interest interest);
	
	public void updateInterest(Interest interest);
	
	public void deleteInterest(Interest interest);
	
	public ArrayList<Interest> getUserInterestList(User user);
	
	public ArrayList<Interest> getInterestList();
	
}
