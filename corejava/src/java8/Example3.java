package java8;
@FunctionalInterface
interface service
{
	String login(String username , String password);
	
}
public class Example3 {

	public static void main(String[] args) {
		
		service s1 = (username,password) -> {return username.equalsIgnoreCase("sameer")
				&& password.equals("apsar@123")?"login succes":"login faill";};
			String status1=s1.login("sameer" , "apsar@123");	
			System.out.println("your login status ..."+status1);
			
			service s2= (username,password) -> username.equalsIgnoreCase("sameer")&& password.equals("apsar@123")?"lohin success":"login fail";
				String status2 =s2.login("sameer", "apsar@321");
				System.out.println("your log in fail.."+status2);
		}
	}


