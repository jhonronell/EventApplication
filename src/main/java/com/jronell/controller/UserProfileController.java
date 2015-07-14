package com.jronell.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jronell.dao.impl.EventDaoImpl;
import com.jronell.dao.impl.UserDaoImpl;
import com.jronell.factory.ServiceFactory;
import com.jronell.model.User;
import com.jronell.service.EventService;
import com.jronell.service.InterestService;
import com.jronell.service.UserService;

/**
 * Servlet implementation class UserProfileController
 */
@WebServlet("/UserProfileController")
public class UserProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserProfileController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		//session
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		
		int userId = user.getUserId();
	
	    user.setUserId(userId);
	//	user.setEventList(  eventList.getEvents( user.getId() ) );
		
	    EventService eventService = ServiceFactory.createEventService();
		InterestService interestService = ServiceFactory.createInterestService();
		
		user.setEvents(  eventService.getEventByUserId(userId) );
		user.setInterestList(  interestService.getUserInterestList(userId)   );
		
		request.setAttribute("user",user );
	
		response.setContentType("text/html");
		//request.setAttribute("userEvents", eventService.getEventByUserId(userId));
		//request.setAttribute("userInterest",);
		
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("userprofile.jsp");  
		requestDispatcher.forward(request, response);  
		doPost(request,response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//do the doGet Method
	//	System.out.println(request.getParameter("userId") );
		if(	request.getParameter("userId") != null)
		{
			doGet(request,response);
		}
		
	}

}
