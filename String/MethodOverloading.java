package string;

public class MethodOverloading {

	public void area(int side) {
		int result = side * side;
		System.out.println("Area of Square is " + result);

	}

	public void area(int length, int breadth) {
		int result = length * breadth;
		System.out.println("Area of Square is " + result);
	}

	public void area(double pi, int r) {
		double result = pi * r * r;
		System.out.println("Area of Square is " + result);
	}

	public static void main(String[] args) {

	}

}
