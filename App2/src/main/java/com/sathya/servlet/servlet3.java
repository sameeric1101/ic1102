package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet3")
public class servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		
		PrintWriter writer=response.getWriter();
		

		writer.println("<body style=color:"+"pink"+">");
		writer.println("USERNAME:" +request.getAttribute("USERNAME")+"<br>");
		writer.println("AGE:" +request.getAttribute("AGE")+"<br>");

		writer.println("QUALIFICATION:" +request.getAttribute("QUALIFICATION")+"<br>");
		writer.println("DESIGNATION:" +request.getAttribute("DESIGNATION")+"<br>");
		
		
		writer.println("EMAIL:" +request.getParameter("EMAIL")+"<br>");
		writer.println("MOBILE:" +request.getParameter("MOBILE")+"<br>");

		writer.println("</body>");
		writer.println("</html>");
		

		
	}

}
