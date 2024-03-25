package Arrays;
import java.util.*;
public class names {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i,n;
		String a[]=new String[10] ;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		
		System.out.println("enter the names of emp");
	
		
		
		for(i=0;i<n;i++) {
			
			
			a[i]=sc.next();
			
			System.out.println("employe names are");
			for(i=0;i<=a.length;i++) {
				System.out.println(a[i]);
				
			}
			
			
			
		}
				
	}

}
