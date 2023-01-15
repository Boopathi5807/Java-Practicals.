package java8features;

@FunctionalInterface
interface DemoClass {
	public void disply();

}

class Demo2 implements DemoClass {

	@Override
	public void disply() {
		System.out.println("This is functional interface abstract method");

	}

}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Demo2 obj = new Demo2();

		obj.disply();

	}

}

/*
 * FunctionalInterface
 * 
 * defines interface have only one abstract method..
 * 
 * but in functionalInterface we can create many number of default and Static
 * methods...
 */