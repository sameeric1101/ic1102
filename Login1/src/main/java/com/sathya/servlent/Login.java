package com.sathya.servlent;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//read the foam data
		String usarname= request.getParameter("usarname");
		String password= request.getParameter("password");
		
		//process the data
		String Sa;
		
		if(usarname.equals("sameer")&&  password.equals("apsar")) {
			
			Sa= "login successfull";
		}
		else
		{
			Sa="loginfaill...";
			
		}
		
		//reder the response
		
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>Loginstatus</h1>"+Sa);
		writer.println("</html>");
	}

}
