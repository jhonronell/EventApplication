package com.jronell.serviceImpl;

import java.util.List;

import com.jronell.dao.InterestDao;
import com.jronell.model.Interest;
import com.jronell.service.InterestService;

public class InterestServiceImpl implements InterestService {

	private InterestDao interestDao;

	@Override
	public void addInterest(Interest interest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateInterest(Interest interest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InterestDao setInterestDao(InterestDao interestDao) {
		// TODO Auto-generated method stub
		return this.interestDao = interestDao;
	}

	@Override
	public List<Interest> getInterestList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Interest> getUserInterestList(int userId) {
		
		
		return interestDao.getUserInterestList(userId);
		
	}

	
	
	
	
	
}
