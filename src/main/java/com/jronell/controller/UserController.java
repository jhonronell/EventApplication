package com.jronell.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.runner.Request;

import com.jronell.factory.ServiceFactory;
import com.jronell.model.User;
import com.jronell.model.User.Gender;
import com.jronell.service.UserService;

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
		//  RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");  
	     // rd.forward(request, response);  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
	  	
	 	String firstName = request.getParameter("firstName");
	 	String lastName = request.getParameter("lastName");
		String middleName = request.getParameter("middleName");

	 	String gender = request.getParameter("gender");
	 	String dateOfBirth = request.getParameter("dateOfBirth");
	
	 	User newUser = new User();
	 	newUser.setFirstName(firstName);
	 	newUser.setMiddleName(middleName);
	 	newUser.setLastName(lastName);
		newUser.setDateOfBirth( dateOfBirth);
	 	newUser.setGender(  newUser.checkGender(gender)     );
	    UserService userService = ServiceFactory.createUserService();
	    userService.addUser(newUser);
	 	
	 	request.setAttribute("userprofile",newUser);  
	 	System.out.println(request.getContentType());
	 	request.getRequestDispatcher("userProfile?userId=1").forward(request, response);
	 	 
	}

}
