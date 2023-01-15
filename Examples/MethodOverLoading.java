package work;

class maths {
	public void maths(int a, int b) {
		System.out.println(a + b);
	}

	public void maths(int a, float b, double c) {
		System.out.println(a + b - c);

	}

	public void maths(int a, double b, float c, int d, int e) {
		System.out.println(a + b + c + d + e);
	}

}

public class MethodOverLoading {
	public static void main(String[] args) {
		maths math = new maths();
		math.maths(10, 20);
		math.maths(10, 20, 30);
		math.maths(1, 02, 05, 06, 1);
	}

}
