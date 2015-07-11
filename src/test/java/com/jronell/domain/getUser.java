package com.jronell.domain;

import org.junit.Test;

import com.jronell.dao.impl.InterestDaoImpl;
import com.jronell.factory.ServiceFactory;
import com.jronell.model.Interest;
import com.jronell.service.InterestService;

public class getUser {

	@Test
	public void getUserInterestList() {
		
		
		
		InterestDaoImpl interest = new InterestDaoImpl();
		List<Interest> data = interest.getUserInterestList(1);
		
		forEach(interest : data){
			
		}
	}

}
