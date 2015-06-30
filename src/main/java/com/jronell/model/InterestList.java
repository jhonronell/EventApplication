package com.jronell.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.management.RuntimeErrorException;

public class InterestList {
	
	private ArrayList<Interest> interestList = new ArrayList<Interest>();
	
	public InterestList() {
		// TODO Auto-generated constructor stub
	}
	
	public void addInterest(Interest interest){
	   if(!exist(interest)){ 		
		interestList.add(interest);
       }
       else{
    	   throw new RuntimeException("It already exist");	
       }
	}
	
	public boolean exist(Interest interest){
	   for(Interest currentInterest : interestList ){
		 if(currentInterest.getName().equals(interest.getName())  ){
			return true; 
		 }
	   }
	   return false;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((interestList == null) ? 0 : interestList.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof InterestList)) {
			return false;
		}
		InterestList other = (InterestList) obj;
		if (interestList == null) {
			if (other.interestList != null) {
				return false;
			}
		} else if (!interestList.equals(other.interestList)) {
			return false;
		}
		return true;
	}

	public ArrayList<Interest> getInterestList(){
		
		return new ArrayList<Interest>(interestList);
		
	}
	
	public int getInterestSize()
	{
		return interestList.size();
		
	}
	
	
	

}
