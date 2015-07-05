package com.jronell.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.jronell.dao.impl.InterestDaoImpl;
import com.jronell.dao.impl.InterestTypeDaoImpl;
import com.jronell.model.Interest;
import com.jronell.model.InterestType;

/**
 * Servlet implementation class InterestTypeController
 */
@WebServlet("/InterestTypeController")
public class InterestTypeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InterestTypeController() {
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
	 	

	 	InterestType newInterestType = new InterestType(name);
	 	newInterestType.setStatus("Active");
	 	newInterestType.setUserId(userId);
	 	
	 	
	   	InterestTypeDaoImpl interestTypeDao = new InterestTypeDaoImpl();
	   	interestTypeDao.addInterestType(newInterestType);
	    
		request.setAttribute("interestType",newInterestType);  

        RequestDispatcher rd = request.getRequestDispatcher("interestType.jsp");  
        rd.forward(request, response);  
		
		
	}

}
