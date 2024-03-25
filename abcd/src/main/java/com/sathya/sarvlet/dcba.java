package com.sathya.sarvlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class dcba extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private PrintWriter writer;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		
response.setContentType("text/html");
		
		writer.println("<html>");
		
		
		
		writer.println("<h1>sameer</h1>");
		writer.println("<h4>arif,kumar</h4>");
		
	}

}
