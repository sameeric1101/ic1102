package com.sathya.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
	public int save(product product) throws SQLException, ClassNotFoundException  {
		//declare the resources
				Connection connection=null;
				PreparedStatement preparedStatement=null;
				int res=0;
				
				try {
				//get the connection
				connection=Dbconnecton.createconnection();
				
				//create preparedStatement object
				
				preparedStatement = connection.prepareStatement("insert into product values(?,?,?,?,?,?,?,?)");
				
				//Read the data from pro object and set to parameters
				preparedStatement.setString(1, product.getProId());
				preparedStatement.setString(2, product.getProName());
				preparedStatement.setDouble(3, product.getProprice());
				
				preparedStatement.setString(4, product.getProBrand());
				preparedStatement.setString(5, product.getPromadein());
				preparedStatement.setDate(6, product.getPromfgdate());
				preparedStatement.setDate(7, product.getProexpdate());
				preparedStatement.setDate(8, product.getProImage());
				
				
				res=preparedStatement.executeUpdate();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				finally 
				{
				//close the resources
				if(connection !=null)
					connection.close();
				if(preparedStatement !=null)
					preparedStatement.close();	
				}
			return res;
	}
	//find all
	public List<product> findAll() throws ClassNotFoundException
	{
		List<product> productListDisplay=new ArrayList<product>();
		try(Connection connection=Dbconnecton.createconnection();
				Statement statement=connection.createStatement())
		{
			ResultSet resultSet=statement.executeQuery("select * from product");
			
			while(resultSet.next())
			{
				product product=new product();
				product.setProId(resultSet.getString("proId"));
				product.setProName(resultSet.getString("proName"));
				product.setProprice(resultSet.getDouble("proPrice"));
				product.setProBrand(resultSet.getString("proBrand"));
				product.setPromadein(resultSet.getString("proMadeIn"));
				product.setPromfgdate(resultSet.getDate("proMfgDate"));
				product.setProexpdate(resultSet.getDate("proExpireDate"));
				product.setProImage(resultSet.getBytes("proImage"));
				// to work with image data
				
				
				
				productListDisplay.add(product);
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return productListDisplay;
		
	}

}