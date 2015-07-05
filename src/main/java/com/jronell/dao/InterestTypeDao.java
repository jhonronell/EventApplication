package com.jronell.dao;

import java.util.List;

import com.jronell.model.InterestType;

public interface InterestTypeDao {

	public void addInterestType(InterestType interestType);
	
	public void updateInterestType(InterestType interest);
	
	public void deleteInterestType(InterestType interest);
	
	public List<InterestType> getInterestTypeList();
	
	
}

