package multithread;


/* ...........................Extending the Thread class...............................*/


class A extends Thread {
	public void run() {
		System.out.println("Thrad A is started...");

		for (int i = 1; i <= 10; i++) {
			System.out.println("Thrad A    " + i);
		}
		System.out.println("Thread A is Exit...");
	}
}

class B extends Thread {
	public void run() {
		System.out.println("Thrad B is started...");
		for (int j = 1; j <= 10; j++) {
			System.out.println("Thrad B    " + j);
		}
		System.out.println("Thread B is Exit...");
	}
}

class C extends Thread {
	public void run() {
		System.out.println("Thrad C is started...");
		for (int k = 1; k <= 10; k++) {
			System.out.println("Thrad C    " + k);
		}
		System.out.println("Thread C is Exit...");
	}
}

public class MultiThreadingDem {

	public static void main(String[] args) {

		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();

		obj1.start();
		obj2.start();
		obj3.start();

	}

}
