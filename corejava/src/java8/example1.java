package java8;
@FunctionalInterface

	interface Greeting{

	void greet();

}
	public class example1 {
	public static void main(String[] args) {
	
	Greeting g1= () ->	System.out.println("sameer is nice");
	
	g1.greet();
	Greeting g2= () ->	System.out.println("apsar");
						System.out.println(" friends");
						
						g2.greet();

	}

}

