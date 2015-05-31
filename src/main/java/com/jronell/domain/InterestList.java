package com.jronell.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class InterestList {
	
	private Set<Interest> interestList = new HashSet<Interest>();
	
	public InterestList() {
		// TODO Auto-generated constructor stub
	}
	
	public void addInterest(Interest interest){
		
		interestList.add(interest);
		
	}
	
	public ArrayList<Interest> getInterestList(){
		return new ArrayList<Interest>(interestList);
	}
	public int getInterestSize()
	{
		return interestList.size();
		
	}
	
	
	

}
