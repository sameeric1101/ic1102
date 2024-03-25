package com.sathya.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Dbconnecton {

	//this method create the connection & return connection
	public static Connection createconnection() throws ClassNotFoundException, SQLException
	{
		Connection connection = null;
		
	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##kumar","123");
		
		
		
		return connection;
	}
		
		


}