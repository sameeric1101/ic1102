package com.sathya.servlent;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EMPapp")
public class EMPapp extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//read the data
				int employeeId =Integer.parseInt(request.getParameter("employeeId"));
				String employeeName = request.getParameter("employeeName");
				double employeeSalary = Double.parseDouble(request.getParameter("employeeSalary"));
				
				//process the data
				double hra = 0, da = 0, pf =0;
				double gs = 0;
				
				if(employeeSalary>=50000)
				{
					hra=employeeSalary*(30)/100;
					da=employeeSalary*(10)/100;
					pf=employeeSalary*(6)/100;
					
					gs=employeeSalary+hra+da-pf;
				}
				else if(employeeSalary>25000 && employeeSalary<50000)
				{
					hra=employeeSalary*(20)/100;
					da=employeeSalary*(5)/100;
					pf=employeeSalary*(3)/100;
					 gs=employeeSalary=hra+da-pf;
				}
				else
				{
					hra=employeeSalary*(10)/100;
					da=employeeSalary*(3)/100;
					pf=employeeSalary*(2)/100;
					
					gs=employeeSalary+hra+da-pf;
				}
				PrintWriter Writer = response.getWriter();
				Writer.println("employeeId : "+employeeId);
				Writer.println("employeeName : "+employeeName);
				Writer.println("employeeSalary : "+employeeSalary);
				Writer.println("hra Amount : "+hra);
				Writer.println("da Amount : "+da);
				Writer.println("pf Amount :"+pf);
				Writer.println("grossSalary : "+gs);
				
				}
				
		}
		
		
		


