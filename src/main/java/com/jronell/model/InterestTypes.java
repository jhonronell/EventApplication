package com.jronell.model;

import java.util.ArrayList;

public class InterestTypes {

	public ArrayList<Interest> interestType = new ArrayList<Interest>();
	
	public void addInterestType(Interest interest){
		interestType.add(interest);
	}
	
	public ArrayList<Interest> getInterestTypes(){
		
		return new ArrayList<Interest>(interestType);
		
	}
	public int getInterestSize()
	{
		return interestType.size();
		
	}
	
}
