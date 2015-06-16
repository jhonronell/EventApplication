package com.jronell.domain;
import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

import com.jronell.model.Address;
import com.jronell.model.ContactInformation;
import com.jronell.model.Interest;
import com.jronell.model.InterestList;
import com.jronell.model.Status;
import com.jronell.model.User;
import com.jronell.model.User.Gender;
import com.jronell.model.User.UserType;


public class TestCase {

	private static final String NONE = null;
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
		ContactInformation conInfo = new ContactInformation("jhonronell@gmail.com", "09176234028", NONE, NONE);
		
		InterestList newInterestList = new InterestList(); 
		
		newInterestList.addInterest( new Interest("Hiking") );
//		newInterestList.addInterest( new Interest("Hiking") );
//		newInterestList.addInterest( new Interest("Hiking") );
		newInterestList.addInterest( new Interest("Biking") );
		newInterestList.addInterest( new Interest("Diving") );
		newInterestList.addInterest( new Interest( "Kayaking"));
		
		//assertEquals(newInterestList.getInterestSize(),  4 );
		
		user1.setInterest(newInterestList);
		user1.setcontactInformation(conInfo);
		user1.setAddress(address);
		user1.setCredentials("JuanDelaCruz","JuanDelaCruzPass",UserType.CLIENT,Status.ACTIVE);
		user1.addUserPersonalInformation(1, "Juan","Dela Cruz", "Pacquia", Gender.MALE, new Date(11/12/2004),25);
		
		assertTrue(user1.getStatus() == Status.ACTIVE);
		
		
		user1.getInterestList();
		
		System.out.println( user1.displayUserInfo() );
		
		
	}

}