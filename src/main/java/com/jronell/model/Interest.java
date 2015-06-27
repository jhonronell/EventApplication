package com.jronell.model;

public class Interest {

	private final String interestName;
	private int interestId;
		
	public Interest(String interest) {
		// TODO Auto-generated constructor stub
		this.interestName = interest;
		
	}
	public String getInterestName(){
		
		return this.interestName;
	}

	public int getInterestId() {
		return interestId;
	}

}
