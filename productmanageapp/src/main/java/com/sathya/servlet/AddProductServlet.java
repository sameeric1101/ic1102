package com.sathya.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/AddProductServlet")
@MultipartConfig
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Date proImage;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Read the data
		String proId=request.getParameter("proId");
		String proName=request.getParameter("proName");
		Double proPrice=Double.parseDouble(request.getParameter("proPrice"));
		String proBrand=request.getParameter("proBrand");
		String proMadeIn=request.getParameter("proMadeIn");
		Date proMfgDate=Date.valueOf(request.getParameter("proManufactureDate"));
		Date proExpireDate=Date.valueOf(request.getParameter("proExpireDate"));
		
		Part part=request.getPart("proImage");		
		InputStream inputSteam=part.getInputStream();
		
	
	
		
		//using above details create product object
		product product=new product();
		product.setProId(proId);
		product.setProName(proName);
		product.setProprice(proPrice);
		product.setProBrand(proBrand);
		product.setPromadein(proMadeIn);
		product.setPromfgdate(proMfgDate);
		product.setProexpdate(proExpireDate);
		product.setProImage(proImage);
		
		//pass the object to productDao
		ProductDao dao=new ProductDao();
		int res=0;
				try {
					res=dao.save(product);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		System.out.println("Data inserted successfully....."+res);
	}

}