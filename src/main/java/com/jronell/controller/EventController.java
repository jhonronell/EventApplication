package com.jronell.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jronell.factory.ServiceFactory;
import com.jronell.model.Event;
import com.jronell.model.EventAddress;
import com.jronell.model.EventType;
import com.jronell.model.Status;
import com.jronell.service.EventService;
import com.jronell.service.InterestService;
import com.jronell.service.InterestTypeService;

/**
 * Servlet implementation class EventController
 */
@WebServlet("/EventController")
public class EventController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final EventType NONE = null;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   
		InterestTypeService interestService = ServiceFactory.createInterestTypeService();
		
		request.setAttribute("interestTypeList", interestService.getInterestTypes() );  
        
		RequestDispatcher rd=request.getRequestDispatcher("AddEvent.jsp");  
        
		rd.forward(request, response);  
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		   	EventType eventType = EventType.validate(request.getParameter("eventType"));
		   	String name = request.getParameter("name");
		   	String eventDateStart = request.getParameter("eventDateStart");
		   	String eventDateEnd = request.getParameter("eventDateEnd");
		   	String eventDatePosted = request.getParameter("eventDatePosted");
		   	Status eventStatus = Status.validate( request.getParameter("status") );
		   	String description = request.getParameter("description");
		   	Event event = new Event( eventType , name , eventDateStart ,eventDateEnd, eventDatePosted,  eventStatus, description );
			
		   	String category = request.getParameter("category");
		   	
		   	
		   	String street = request.getParameter("street");
		   	String brgy = request.getParameter("brgy");
		   	String city = request.getParameter("city");
		   	String region = request.getParameter("region");
		   	String province = request.getParameter("province");
		   	EventAddress address = new EventAddress(street,brgy,city,region,province);
			   	
		   	int organizerId = 1; 
			event.setAddress(address);
		    event.setOrganizerId(organizerId);
		   	
		    EventService eventService = ServiceFactory.createEventService();
	        eventService.addEvent(event);
	        
			request.setAttribute("event1",event);  
	        RequestDispatcher rd=request.getRequestDispatcher("display.jsp");  
	        rd.forward(request, response);  
	}



	


}
