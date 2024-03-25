package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class secoandservlet
 */
@WebServlet("/secoandservlet")
public class secoandservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//get the data
		
				String designation =request.getParameter("designation");
			String qualification=request.getParameter("qualification");
			

				//create the session object
				HttpSession session=request.getSession();
				
				//place the data in session object
				
				session.setAttribute("designation",designation);
				session.setAttribute("qualification",qualification);
				
				
				//forward the next form
				RequestDispatcher dispatcher=request.getRequestDispatcher("form3.html");	
		
		
		
		
		
		
		
		doGet(request, response);
	}

}
