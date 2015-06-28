package com.jronell.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jronell.dao.InterestType;
import com.jronell.dao.impl.InterestTypeDaoImpl;
import com.jronell.dao.impl.UserDaoImpl;
import com.jronell.model.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
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
	 	String firstName = request.getParameter("firstName");
	 	String lastName = request.getParameter("lastName");
		String middleName = request.getParameter("middleName");
	   	
	 	User newUser = new User();
		
	 	newUser.setFirstName(firstName);
	 	newUser.setMiddleName(middleName);
	 	newUser.setLastName(lastName);
	 	
	 	UserDaoImpl userDaoImpl = new UserDaoImpl();
	 	userDaoImpl.addUser(newUser);
	 	  
	 	request.setAttribute("user",newUser);  

        RequestDispatcher rd = request.getRequestDispatcher("user.jsp");  
        rd.forward(request, response);  
	}

}
