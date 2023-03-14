package ustbatchno3.sonarqubetest;

public class Employee {
	private String name;
	private int age;
	private int years_worked;
	private double salary;
	public Employee(String name, int age, int years_worked, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.years_worked = years_worked;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYears_worked() {
		return years_worked;
	}
	public void setYears_worked(int years_worked) {
		this.years_worked = years_worked;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", years_worked=" + years_worked + ", salary=" + salary
				+ "]";
	}
	
}
