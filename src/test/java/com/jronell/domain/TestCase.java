package com.jronell.domain;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestCase {

	@Test
	public void addToInterestList() {
		// TODO Auto-generated constructor stub
		
		InterestList newInterestList = new InterestList(); 
		
		newInterestList.addInterest( new Interest("Hiking") );
		newInterestList.addInterest( new Interest("Biking") );
		newInterestList.addInterest( new Interest("Diving") );
		newInterestList.addInterest( new Interest( "Kayaking"));
		
		assertEquals(newInterestList.getInterestSize(),  4 );
		
	}
	@Test
	public void createAndAddInterestAddressToUser() {
		// TODO Auto-generated constructor stub
		
		User user1 = new User(1);
		
		Address address = new Address("San Lorenzo","Kapitolyo","Pasig","boystown","NCR","Manila","PH");
		
		InterestList newInterestList = new InterestList(); 
		newInterestList.addInterest( new Interest("Hiking") );
		newInterestList.addInterest( new Interest("Biking") );
		newInterestList.addInterest( new Interest("Diving") );
		newInterestList.addInterest( new Interest( "Kayaking"));
		assertEquals(newInterestList.getInterestSize(),  4 );
		
		user1.addInterest(newInterestList);
		user1.addAddress(address);
		
		
	//	user1.setPersonalInfo( );
		
		
		
		
	}

}