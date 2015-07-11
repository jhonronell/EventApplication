package com.jronell.service;

import java.util.List;

import com.jronell.dao.InterestDao;
import com.jronell.model.Interest;

public interface InterestService {

	public InterestDao setInterestDao(InterestDao interestDao);
	
	public void addInterest(Interest interest);
	
	public void UpdateInterest(Interest interest);
	
	public List<Interest> getInterestList();
	
	public List<Interest> getUserInterestList(int userId);
	
}
