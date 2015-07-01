package com.jronell.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jronell.dao.impl.EventDaoImpl;
import com.jronell.model.EventAddress;
import com.jronell.model.Event;
import com.jronell.model.EventType;
import com.jronell.model.Status;
import com.jronell.model.User;
import com.jronell.serviceImpl.EventServiceImpl;

/**
 * Servlet implementation class EventController
 */
@WebServlet("/eventServlet")
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
		   
		    
		   	Event event = new Event( eventType , name , eventDateStart ,eventDateEnd, eventDatePosted,  eventStatus );
		   			   			  
		    EventServiceImpl eventService = new EventServiceImpl();		    
		    eventService.addEvent(event);
		    
			request.setAttribute("event1",event);  

	        RequestDispatcher rd=request.getRequestDispatcher("display.jsp");  
	        rd.forward(request, response);  
	}



	


}
