package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calapp")
public class calapp extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		//read the data
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String oparation = request.getParameter("oparation");
		
		
		//step2 render the response
		
		int result=0;
		switch(oparation)
		{
		case "+":result=num1+num2;
		break;
		
		case "-":result=num1-num2;
		break;
		
		case "*":result=num1*num2;
		break;
		
		case "/":result=num1/num2;
		break;
		
		case "%":result=num1%num2;
		break;
		
		
		}
		PrintWriter writer = response.getWriter();
		writer.println("resuly is"+result);
}
	}


