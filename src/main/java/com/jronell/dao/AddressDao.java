package com.jronell.dao;

import java.sql.Connection;
import java.util.Collection;



import com.jronell.model.Address;

public interface AddressDao {
	

	public void addAddress(Address address);
	
	public void updateAddress(Address address);
	
	public Collection<Address> listAddress();
	
	public Collection<Address> listUserAddress();
	
}
