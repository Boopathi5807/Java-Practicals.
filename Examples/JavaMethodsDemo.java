package work;

public class JavaMethodsDemo {

	int a;           // instance variable= class ku ulla irukkanum . method ku veliya irukkanum ..
	int b;

	JavaMethodsDemo(int num, int numb) {       // parameeter constructor

		a = num;               // local variable
		b = numb;
	}

	void add() {                      //	declare the method
		int s = a + b;                        // block of code 
		System.out.println(s);
	}

	void sub() {
		int d = a - b;
		System.out.println(d);
	}

	public static void main(String[] args) {

		JavaMethodsDemo m1 = new JavaMethodsDemo(50, 40);    // object create with parameeter 
		m1.add();
		m1.sub();

	}

}
