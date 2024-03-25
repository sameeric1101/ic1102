package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String DESIGNATION=request.getParameter("DESIGNATION");
		String QUALIFICATION=request.getParameter("QUALIFICATION");
		//create the session object
		HttpSession session=request.getSession();
		
		//place the data into the session object
		session.setAttribute("QUALIFICATION",QUALIFICATION );
		session.setAttribute("DESIGNATION" ,DESIGNATION);
		
		//give the next form
		RequestDispatcher dispatcher=request.getRequestDispatcher("FORM3.HTML");
		dispatcher.forward(request, response);
		
	}

}
