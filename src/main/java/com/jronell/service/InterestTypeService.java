package com.jronell.service;

import java.util.List;



import com.jronell.dao.InterestTypeDao;
import com.jronell.dao.impl.InterestTypeDaoImpl;
import com.jronell.model.Interest;
import com.jronell.model.InterestType;

public interface InterestTypeService {

	
	public void addInterestType(InterestType interestType);
	
	public void deleteInterestType(int interestId);
	
	public void updateInterestType(InterestType interestType);
	
	public List<InterestType> getInterestTypes();
	
	public void setInterestTypeDao(InterestTypeDao interestTypeDao);
}
