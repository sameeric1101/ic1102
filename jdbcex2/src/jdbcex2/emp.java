package jdbcex2;

public class emp {
	int empId;
	String empName;
	Double empSalary;
	
	public emp() {
		
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}


	public emp(int empId, String empName, Double empSalary) {
	
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		empSalary=this.empSalary;

}
}

