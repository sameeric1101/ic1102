package com.sathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		
		response.setContentType("text/html");
		
		writer.println("<hrml>");
		writer.println("<sameer>");
		writer.println("<hello world>");
		
	}

}
