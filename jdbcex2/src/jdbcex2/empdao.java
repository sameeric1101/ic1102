package jdbcex2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class empdao {
	public  int save(emp emp) throws SQLException, ClassNotFoundException
    {
	//Declare the resource
		
			
	Connection connnection =null;
	PreparedStatement preparedStatement=null;
	int count = 0;
	try {
		//get the connection                         
		connnection =dbconnection.createconnection();
		//create the prepared statement object
		
		
		preparedStatement= connnection.prepareStatement("insert into emp values(?,?,?)");
		//read the data from Emp object and set to parameters

		preparedStatement.setInt(1, emp.getEmpId());
		preparedStatement.setString(2, emp.getEmpName());
		preparedStatement.setDouble(3, emp.getEmpSalary());
		
		count = preparedStatement.executeUpdate();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	finally
	{
		//before release connection check the connection preset are not
		if(connnection !=null)
			connnection.close();
		if(preparedStatement!=null)
			preparedStatement.close();
	}
	return count;
}

	public emp findById(int empId) throws SQLException, ClassNotFoundException
	{
		emp employee = null;
		
		//try with resource once the try
		
		try(Connection connection = dbconnection.createconnection();
		PreparedStatement preparedStatement = connection.prepareStatement("select*from emp where empId=?");
				)
				{
					//set the data to parameter
					
					preparedStatement.setInt(1, empId);
					
					//execute the query
					ResultSet resultset=preparedStatement.executeQuery();
					if(resultset.next())
					{
					//read the data from result set into employee e
						
						employee = new emp();
						
						employee.setEmpId(resultset.getInt(1));
						employee.setEmpName(resultset.getString(2));
						employee.setEmpSalary(resultset.getDouble(3));
					}
					
						resultset = preparedStatement.executeQuery();
					} catch (SQLException  e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//if the record is not preset execute below code , if the record is not present it returns null
		return employee;
	

	}

	
	}

	}


