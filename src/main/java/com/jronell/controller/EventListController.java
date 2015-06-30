package com.jronell.controller;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jronell.dao.impl.EventDaoImpl;
import com.jronell.dao.impl.UserDaoImpl;
import com.jronell.model.Event;
import com.jronell.model.EventList;
import com.jronell.model.User;

/**
 * Servlet implementation class EventListController
 */
@WebServlet("/EventListController")
public class EventListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			response.setContentType("text/html");
			EventDaoImpl eventDao = new EventDaoImpl();
			EventList eventList = eventDao.getEvents(); 
			request.setAttribute("eventListResult", eventList.getEventList() );
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("eventList.jsp");  
			requestDispatcher.forward(request, response);  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
