package com.jronell.factory;

import com.jronell.dao.impl.AuthenticationDaoImpl;
import com.jronell.dao.impl.BucketListDaoImpl;
import com.jronell.dao.impl.EventDaoImpl;
import com.jronell.dao.impl.InterestDaoImpl;
import com.jronell.dao.impl.InterestTypeDaoImpl;
import com.jronell.dao.impl.UserDaoImpl;
import com.jronell.service.AuthenticationService;
import com.jronell.service.BucketListService;
import com.jronell.service.EventService;
import com.jronell.service.InterestService;
import com.jronell.service.InterestTypeService;
import com.jronell.service.UserService;
import com.jronell.serviceImpl.AuthenticationServiceImpl;
import com.jronell.serviceImpl.BucketListServiceImpl;
import com.jronell.serviceImpl.EventServiceImpl;
import com.jronell.serviceImpl.InterestServiceImpl;
import com.jronell.serviceImpl.InterestTypeServiceImpl;
import com.jronell.serviceImpl.UserServiceImpl;

public class ServiceFactory {
    public static EventService createEventService() {
    	EventServiceImpl eventService = new EventServiceImpl();
        eventService.setEventDao(new EventDaoImpl());
         return eventService;     
    }
    public static UserService createUserService() {
    	UserServiceImpl userService = new UserServiceImpl();
    	userService.setUserDao(new UserDaoImpl());
         return userService;
    }
    public static InterestService createInterestService(){
    	InterestServiceImpl interestService = new InterestServiceImpl();
    	interestService.setInterestDao(new InterestDaoImpl());
    	return interestService;
    }
    public static InterestTypeService createInterestTypeService(){
    	InterestTypeServiceImpl interestTypeService = new InterestTypeServiceImpl();
    	interestTypeService.setInterestTypeDao(new InterestTypeDaoImpl());
    	return interestTypeService;
    }
    public static AuthenticationService createAuthenticationService(){
    	AuthenticationServiceImpl authenticationService = new AuthenticationServiceImpl();
    	authenticationService.setAuthenticationDao(new AuthenticationDaoImpl());
    	return authenticationService;
    }
    public static BucketListService createBucketListService(){
    	BucketListServiceImpl bucketListService = new BucketListServiceImpl();
    	bucketListService.setBucketListDao(new BucketListDaoImpl());
    	return bucketListService;
    }
 
}

//the service factory create a type from interface of the eventservice then return the 
//event implementation 
