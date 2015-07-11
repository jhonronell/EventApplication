package com.jronell.domain;

import java.util.Iterator;
import java.util.List;

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
		System.out.println("success");
		System.out.println(data.size());
		for(Interest ui: data){
			System.out.println(ui.getName());
		}
	}
	@Test
	public void testDao(){
		
		InterestService interestService = ServiceFactory.createInterestService();
		interestService.getUserInterestList(1);
		
	}

}
