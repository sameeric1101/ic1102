package jdbcex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {
	public static Connection createconnection() throws ClassNotFoundException, SQLException
	{
		Connection connection = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sameer","apsar");
	
		return connection;
	}

}
