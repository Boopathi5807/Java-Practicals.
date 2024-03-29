package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;

	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class Assignment5 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		list.add(new Employee(101, "Aashik", "123 street, India", 20000.0));
		list.add(new Employee(102, "Ashvin", "234 street, India", 30000.0));
		list.add(new Employee(103, "Selva", "345 street, India", 25000.0));
		list.add(new Employee(104, "Boopathi", "456 street, India", 40000.0));

		Iterator<Employee> it = list.iterator();
		int searchId = 104;
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
	}

}
