package com.jronell.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jronell.dao.impl.EventDaoImpl;
import com.jronell.dao.impl.InterestDaoImpl;
import com.jronell.model.Event;
import com.jronell.model.EventAddress;
import com.jronell.model.EventType;
import com.jronell.model.Interest;
import com.jronell.model.Status;
import com.jronell.model.User;

/**
 * Servlet implementation class InterestController
 */
@WebServlet("/InterestController")
public class InterestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InterestController() {
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
  	
	   	String name = request.getParameter("name");
	   	int userId = Integer.valueOf( request.getParameter("userId") );
	 	int interestTypeId = Integer.valueOf( request.getParameter("interestTypeId") );

	 	Interest newInterest = new Interest(name);
	 	newInterest.setInterestTypeId(interestTypeId);
	 	newInterest.setStatus("Active");
	 	newInterest.setUserId(userId);
	 	
	   	InterestDaoImpl interestDao = new InterestDaoImpl();
	   	interestDao.addInterest(newInterest);
	    
		request.setAttribute("interest",newInterest);  

        RequestDispatcher rd = request.getRequestDispatcher("Interest.jsp");  
        rd.forward(request, response);  
		
	}

}
