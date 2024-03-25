package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//step1:read  the form  data
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		
		
		
		//step2 : procees the data 	
		
		String status;
		if(name.equals("sameer")&& password.equals("apsar@123")) {
			
			status = "Login successfull....";
		}
		else
		{
			status = "Login fail...";
			
		}
			//step3 :render the response to client
			
			PrintWriter writer = response.getWriter();
			
			response.setContentType("text/html");
				
					writer.println("<html>");
					writer.println("<h1>Login status ...</h1>"+status);
					writer.println("</html>");
		
		
	}

}
