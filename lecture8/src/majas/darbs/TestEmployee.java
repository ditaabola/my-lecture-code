package majas.darbs;

public class TestEmployee {
	public static void main(String[] args) {

		Employee employee1 = new Employee(01, "John", "Doe", 1000);
		System.out.println("We have a new employee in our company!");
		System.out.println(employee1.toString());
		System.out.println(employee1.getSalary());
		System.out.println(employee1.getAnnualSalary());
		System.out.println(employee1.getRaiseSalary());
		System.out.println(Employee.count);
		System.out.println("We have " + Employee.count + " employees in our company!");

		employee1.getRaiseSalary();
		System.out.println(employee1.getRaiseSalary());
		employee1.getAnnualSalary();

		Employee employee2 = new Employee(02, "Jane", "Mary", 1000);
		System.out.println("We have " + Employee.count + " employees in our company!");
		System.out.println(employee2.toString());

	}
}
