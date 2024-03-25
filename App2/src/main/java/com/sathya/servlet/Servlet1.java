package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the data
		String usarname = request.getParameter("USERNAME");
		int age=Integer.parseInt(request.getParameter("AGE"));
		
		//create the session object
		HttpSession session=request.getSession();
		
		//place the data into the session object
		session.setAttribute( "USERNAME",usarname);
		session.setAttribute("AGE",age);
		
		//give the next form
		RequestDispatcher dispatcher=request.getRequestDispatcher("FORM2.HTML");
		dispatcher.forward(request, response);
		
	}

}


