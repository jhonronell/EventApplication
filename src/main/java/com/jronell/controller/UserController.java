package com.jronell.controller;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.PrintWriter;

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
import com.jronell.model.User.UserType;


/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserController() {
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
	
		     
	     	User user1 = new User(1);
			
			assertEquals(user1.getUserId(),1);
			
			Event event1 = new Event( EventType.DIY , "2002-10-09", "2002-10-09", "2002-10-09", "2002-10-09", Status.ACTIVE , user1.getUserId() );
			
			assertEquals(1,event1.getOrganizingUser());
			
			EventDaoImpl eventDao = new EventDaoImpl();
			eventDao.addEvent( event1  );
		   
			
		    request.setAttribute("event1",event1);  
	          
	       // boolean status=bean.validate();  
	         RequestDispatcher rd=request.getRequestDispatcher("display.jsp");  
	         rd.forward(request, response);  
	       
	      
	}
	
	
	
	

}
