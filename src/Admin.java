
public class Admin extends Person {
	
	private double salary;
	private int workingHours;
	
	
	public 	Admin() {}
	
	public Admin(String name, String contact, double salary, int workingHours) {
		super(name, contact);
		this.salary = salary;
		this.workingHours = workingHours;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	
	

}
