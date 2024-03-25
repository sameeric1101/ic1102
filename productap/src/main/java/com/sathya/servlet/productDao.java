package com.sathya.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class productDao {
	
	public int Product(product product) throws ClassNotFoundException {
//declare the resources
	
	PreparedStatement  PrepareStatement=null;
	Connection connection=null;
	int saveResult=0;
	

	try {
		connection =Dbconnecton.createconnection();
		PrepareStatement = connection.prepareStatement
				("insert into product data values(?,?,?,?,?,?,?,?)");
		
	
		//read  the data
		PrepareStatement.setString (1, product.getProId());
		PrepareStatement.setString(2,product.getProName());

		PrepareStatement.setDouble(3, product.getProprice());
		

		PrepareStatement.setString(4,product.getProBrand());

		PrepareStatement.setString(5,product.getPromadein());

		PrepareStatement.setDate(6,product.getPromfgdate());

		PrepareStatement.setDate(7,product.getProexpdate());
		PrepareStatement.setBinaryStream(8,product.getProImage());
		
		saveResult = PrepareStatement.executeUpdate();
	

	
	
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(PrepareStatement!=null)
				connection.close();
		
			if(PrepareStatement!=null)
				PrepareStatement.close();
			}
	
	
		catch(SQLException e) {
			e.printStackTrace();
	}
	
		finally {
			try {

				if(connection!=null)
					connection.close();
				if(PrepareStatement!=null)
					PrepareStatement.close();
				
			}
			catch(SQLException e) {
				e.printStackTrace();
		}
		}
		}
		return saveResult;
		
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		ResultSet resultSet=new resultSet();
		//the loop repeated hoe many records present in table.
		while(resultSet.next()) {
			
			product product = new product();
			product.setProId(resultSet.getString("ProId"));
			product.setProName(resultSet.getString("proname"));
			product.setProprice(resultSet.getDouble("Proprice"));
			product.setProBrand(resultSet.getString("ProBrand"));
			product.setPromadein(resultSet.getString("Promadein"));
			product.setPromfgdate(resultSet.getDate("Promfgdate"));
			product.setProexpdate(resultSet.getDate("Proexpdate"));
			product.setProImage(null);
			productList("resultSet");
			


			
		
		}	
		
	}
	}


	