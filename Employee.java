public class Employee {
	private String fName, lName;
	private double salary;
	
	public Employee(String fName, String lName, double salary) {
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
		if (salary < 0)
			this.salary = 0;
	}
	
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public double getSalary() {
		return salary;
	}


}
