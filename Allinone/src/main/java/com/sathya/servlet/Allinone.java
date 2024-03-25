package com.sathya.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Allinone")
public class Allinone extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	//read the data
	int startnumber= Integer.parseInt(request.getParameter("startnumber"));
	int endnumber= Integer.parseInt(request.getParameter("endnumber"));
	String operation=request.getParameter("operation");
	
	
	//process the data
	List<Integer>l=new ArrayList<>();
	switch (operation) {
	case "even" : for(int i= startnumber;i<=endnumber;i++){
					if(i%2==0)
						l.add(i);
	
	}
	break;
	
	case "odd" : for(int i=startnumber;i<=endnumber;i++) {
				if(i%2==1)
					l.add(i);
	}
	break;
	
	case "prime" : for(int i=startnumber;i<=endnumber;i++) {
			if(i==1) {
				continue;
			}
			else {
				int k=0;
				for (int j=2;j<i;j++) {
					if(i%j==0)
						k++;
					break;
				}
				if(k==0) {
					l.add(i);
					
				}
			}
	}
	break;
	
	case "strong" : for(int i=startnumber;i<=endnumber;i++) {
		int num2=i;
		int num1=i;
		int num =0;
		int fact=1;
		while(num1!=0)
		{
			fact=1;
			int rem=num1%10;
			num1 =num/10;
			for(int j=1;j<rem;j++)
				fact =fact*j;
			num=num+fact;
			
			
		}
		if(num ==num2)
			l.add(i);
	}
	break;
	
	case "perfect":
		for(int i=startnumber;i<=endnumber;i++) {
			int sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0)
					sum=sum+j;
				
			}
			if(sum ==i)
				l.add(i);
			
		}
		break;
	}
	}

}




