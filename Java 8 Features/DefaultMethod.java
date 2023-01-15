package java8features;

interface Sweet {
	final static int a = 9;

	public void display();
}

class Tamil implements Sweet {

	@Override
	public void display() {
		System.out.println("abstract method displey");

	}

}

public class DefaultMethod {

	public static void main(String[] args) {
		Tamil object = new Tamil();
		object.display();

	}

}
