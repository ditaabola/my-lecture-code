package majas.darbs;

class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	private int annualSalary;
	private double raised;
	public static int count;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		count++;
	}

	public void setSalary() {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;

	}
	
	public double raiseSalary(double raised){
		raised = salary + (salary * 0.02);
		return raised;
	}

	public double getRaiseSalary() {
		return raised;
	}

	public int getAnnualSalary() {
		annualSalary = this.salary * 12;
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

	public int getCount() {
		return count;
	}

	public String toString() {
		return id + " " + firstName + "  " + lastName + ", Salary: "
				+ salary;
	}
}
