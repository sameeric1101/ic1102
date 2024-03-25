package com.sathya.servlets;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorldservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public HelloWorldservlet() {
    	
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
PrintWriter writer = response.getWriter();
		
		writer.println("hello world this is my first app");
		writer.println("my first sevlets");
		writer.println("wellcome to rathan sir classes");
		
	}
	
	

	

}
