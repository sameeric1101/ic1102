package jdbcex2;

import java.sql.SQLException;

public class dbclient {



		public static void main(String[] args)throws ClassNotFoundException, SQLException {
			
			  empdao employeeDao=new empdao(); 
			 int res1= employeeDao.save( 1001,"kumar",50000.55);
			  System.out.println("data inserted successfully"+res1); 
			int res2=employeeDao.save(new emp(1002,"ram",45000.9)); 
			  System.out.println("data inserted successfully"+res2); 
			 int res3=employeeDao.save(new emp(1003,"nithin",30000.98));
			  System.out.println("data insert successfully"+res3);
			  
			 
		
		//read the data from database
		 emp emp;
		try {
			emp = employeeDao.findById(1001);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 System.out.println("emp");

		}
	}

		

		

