package java8features;

interface Collage {
	public void Student();

	default public void Status() {
		System.out.println("  All Present.");
	}

}

class Department implements Collage {

	@Override
	public void Student() {
		System.out.print("Total Student 47 :");

	}

}

public class DefaultMethod1 {

	public static void main(String[] args) {
		Department object = new Department();
		object.Student();
		object.Status();

	}

}
