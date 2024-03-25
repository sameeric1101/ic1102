package com.sathya.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
public class cba extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		
		response.setContentType("text/html");
		writer.println("<html>");
		
		
		
		
		
		writer.println("<h3>gonig  to get marry</h3>");
		writer.println("<h1>apsar is my wife</h1>");
		writer.println("<h2>sameer is my husbend</h2>");
		
		
	}

}
