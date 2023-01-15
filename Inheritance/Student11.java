package inheritance;

//mention abstract keyword before a class that called abstract class.

 abstract class AbstractClassDemo {

	String collage;// it Can't Have final Static constant Variable;
	String Name;
	int marks;

	public void input()// we create open method also.
	{
		collage = "Govt. Collage";
		Name = "boopathi";
		marks = 90;
	}

	 abstract void print(); // we also create abstract method also.
}

public class Student11 extends AbstractClassDemo {

	public static void main(String[] args) {
		// calling the abstract class.
		Student11 sb = new Student11();

		sb.input();
		sb.print();
	}

	@Override
	void print() // implementing abstract method.
	{
		System.out.println("Collage Name  : " + collage);
		System.out.println("Student Name : " + Name);
		System.out.println("Totall Marks : " + marks);

	}
}

