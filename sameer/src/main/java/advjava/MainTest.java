package advjava;
import java.util.*;
 class employee {

	//public static void main(String[] args) {
	int empid;
	String empname;
	double empsalary;
		public employee(int empid, String empname,double empsalaey) {
			super();
			
		
 
	this.empid=empid;
	this.empname=empname;
	this.empsalary=empsalary;
		}
 
 
	
	@Override
	public String toString() {
		return "employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary +"]";
	}
	

	}

 

public class MainTest{
	public static void main(String[] args) {
	
		employee emp = new employee(1001,"sameer",10000);
		System.out.println(emp);
}
}

