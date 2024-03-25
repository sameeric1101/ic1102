import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EX1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
			
			//create the connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe:","sameer","apsar");
			System.out.println("connection is created succesfully");
		
			//close the connection
			con.close();
			System.out.println("connection close success");
		
		
		}
		
		
	}

