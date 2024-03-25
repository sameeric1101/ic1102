package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("username");
		String password= request.getParameter("user password");
		long mobile = Long.parseLong(request.getParameter("mobile number"));
		
		String dob= request.getParameter("dob");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		
		String[] Qualification=request.getParameterValues("Qualification");
		String country = request.getParameter("country");
		
		String[] languages=request.getParameterValues("languages");
		String comments = request.getParameter("comments");
		
		
		//process the data
		
		String q=String.join(",", Qualification);
		String l=String.join("-", languages);
		
		
	
		//render the response
		
		PrintWriter writer = response.getWriter();
		
		writer.println("usarname :"+name);
		writer.println(" password :"+password);
		writer.println("mobile :"+mobile);
		writer.println("date of birth :"+dob);
		writer.println("email :"+email);
		
		
		writer.println("gender :"+gender);
		writer.println("qalification :"+q);
		writer.println("country :"+country);
		writer.println("languages :"+l);
		writer.println("comments :"+comments);
	}

}
