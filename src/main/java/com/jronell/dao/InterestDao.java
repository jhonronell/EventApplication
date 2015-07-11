package com.jronell.dao;

import java.util.List;

import com.jronell.model.Interest;
import com.jronell.model.User;

public interface InterestDao {

	public void addInterest(Interest interest);
	
	public void updateInterest(Interest interest);
	
	public void deleteInterest(Interest interest);
	
	public List<Interest> getUserInterestList(User user);
	
    public List<Interest> getInterestList();
	
	
}
