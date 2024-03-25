package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/firstservlet")
public class firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//get the data
		
		String username=request.getParameter("username");
	int age=Integer.parseInt(request.getParameter("age"));
	

		//create the session object
		HttpSession session=request.getSession();
		
		//place the data in session object
		
		session.setAttribute("username",username);
		session.setAttribute("age",age);
		
		
		//forward the next form
		RequestDispatcher dispatcher=request.getRequestDispatcher("form2.html");
				
		doGet(request, response);
	}

}
