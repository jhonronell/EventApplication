package com.jronell.serviceImpl;

import java.util.List;

import com.jronell.dao.InterestTypeDao;
import com.jronell.model.InterestType;
import com.jronell.service.InterestTypeService;

public class InterestTypeServiceImpl implements InterestTypeService {

	public InterestTypeDao interestTypeDao;
	
	@Override
	public void addInterestType(InterestType interestType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteInterestType(int interestId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateInterestType(InterestType interestType) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<InterestType> getInterestTypes() {
		// TODO Auto-generated method stub
		
		return interestTypeDao.getInterestTypeList();
		
	}


	@Override
	public void setInterestTypeDao(InterestTypeDao interestTypeDao) {
		// TODO Auto-generated method stub
		this.interestTypeDao = interestTypeDao;
		
	}

}
