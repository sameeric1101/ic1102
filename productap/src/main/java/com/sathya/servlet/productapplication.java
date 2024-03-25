package com.sathya.servlet;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/productapplication")
public class productapplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response, Object PreparedStatement) throws ServletException, IOException {
		
	//read the data
			String proid = String.valueOf(request.getParameter("proId"));
			String proname = String.valueOf(request.getParameter("proname"));
			String proprice = String.valueOf(request.getParameter("proprice"));
			String probrand = String.valueOf(request.getParameter("probrand"));
			String promadein = String.valueOf(request.getParameter("promadein"));
			String promfgdate = String.valueOf(request.getParameter("promfgdate"));
			String proexpdate = String.valueOf(request.getParameter("proexpdate"));
			String proImage = String.valueOf(request.getParameter("proImage"));
	

			//process the data
			
			productDao productDao=new productDao();
			product product=new product();
			
			
			
}
}



