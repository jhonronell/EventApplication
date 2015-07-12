package com.jronell.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jronell.factory.ServiceFactory;
import com.jronell.model.User;
import com.jronell.service.AuthenticationService;

/**
 * Servlet implementation class AuthenticationController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 RequestDispatcher requestDispatcher;
		 requestDispatcher=request.getRequestDispatcher("login.jsp");  
		 requestDispatcher.forward(request, response);  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher;
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		AuthenticationService authenticationService = ServiceFactory.createAuthenticationServiceService();
		User user = null;
		user = authenticationService.validateUser(username, password);
	    
		if(user != null){
		
			HttpSession session = request.getSession();
			session.setAttribute("user", user.getFirstName());
			
			response.sendRedirect("userprofile");
			 //requestDispatcher=request.getRequestDispatcher("/userprofile");					
		} else {
			 requestDispatcher=request.getRequestDispatcher("loginError.jsp");  
			 requestDispatcher.forward(request, response);  
		}
		
	}
}

