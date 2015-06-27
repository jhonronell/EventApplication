package com.jronell.dao;

import java.sql.Connection;
import java.util.Collection;



import com.jronell.model.EventAddress;

public interface EventAddressDao {
	

	public void addEventAddress(EventAddress address);
	
	public void updateAddress(EventAddress address);
	
	public Collection<EventAddress> listAddress();
	
	public Collection<EventAddress> listUserAddress();
	
}
