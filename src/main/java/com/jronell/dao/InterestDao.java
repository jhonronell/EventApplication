package com.jronell.dao;

import java.util.List;

import com.jronell.model.Interest;
import com.jronell.model.User;

public interface InterestDao {

	public void addInterest(Interest interest);
	
	public void updateInterest(Interest interest);
	
	public void deleteInterest(Interest interest);
	
	public List<Interest> getUserInterestList(int userId);
	
    public List<Interest> getInterestList();
	
	
}
