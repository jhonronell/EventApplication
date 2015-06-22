package com.jronell.model;

public enum Status {
	
	ACTIVE,INACTIVE,PENDING_REGISTRATION,PENDING_APPROVAL;

	public static Status validate(String status) {
		
		if(status.equals(ACTIVE.toString()) ){
			return (ACTIVE);
		}
		return null;
	
	}
}
