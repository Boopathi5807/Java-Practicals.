package java8features;
import java.util.*;

class Employee{
	private int employeeId;
	private String employeeName;
	private int salary;

	public Employee(int employeeId, String employeeName, int salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
}
public class EmployeeeDemo {

	public static void main(String[] args) {
		
		List<Employee> list= new ArrayList<Employee>();
		list.add(new Employee(1,"aashik",85000));
		list.add(new Employee(2,"ashvin",75000));
		list.add(new Employee(3,"selva",35000));
		list.add(new Employee(4,"ajith",25000));
		list.add(new Employee(5,"gopi",15000));
		System.out.println("Before Sorting----------");
		list.forEach(System.out::println);

	}

}
