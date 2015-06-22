package com.jronell.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jronell.dao.impl.EventDaoImpl;
import com.jronell.model.Event;
import com.jronell.model.EventType;
import com.jronell.model.Status;
import com.jronell.model.User;

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
		
		   	response.setContentType("text/html");
		    User user1 = new User(15);
		    
		   	EventType eventType = EventType.validate(request.getParameter("eventType"));
		   	String name = request.getParameter("name");
		   	String eventDateStart = request.getParameter("eventDateStart");
		   	String eventDateEnd = request.getParameter("eventDateEnd");
		   	String eventDatePosted = request.getParameter("eventDatePosted");
		   	Status eventStatus = Status.validate( request.getParameter("status") );
		   	int organizer = user1.getUserId();
		   	
		   	
		   	System.out.println( eventType + name + eventDateStart + eventDateEnd +  eventDatePosted +  eventStatus + organizer);
		   	
		   	Event event1 = new Event( eventType , name , eventDateStart ,eventDateEnd, eventDatePosted,  eventStatus , organizer );
		
			
			EventDaoImpl eventDao = new EventDaoImpl();
			eventDao.addEvent( event1  );
			request.setAttribute("event1",event1);  

	         RequestDispatcher rd=request.getRequestDispatcher("display.jsp");  
	         rd.forward(request, response);  
	}



	


}
