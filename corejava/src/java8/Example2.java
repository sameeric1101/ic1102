package java8;
@FunctionalInterface
interface operations
{
	void add(int num1,int num2);
	
}

public class Example2 {

	public static void main(String[] args) {

		operations s= (int num1,int num2) -> System.out.println("Addition of two numbers :"+ (num1+num2));
	
	s.add(10 , 20);
	
	operations s1= ( num1, num2) -> System.out.println("Addition of two numbers :"+ (num1+num2));

		s1.add(20,100);
	}

}