package multithread;

class A2 implements Runnable {//Runnable Interface
	public void run() {
		System.out.println("A2..visible");
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("A2..." + i);
			}
			System.out.println(i);
		}
		System.out.println("A2  Exit");
	}
}

class B2 extends Thread {  // Thread Interface
	public void start() {
		System.out.println("B2..visible");
		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}
		System.out.println("B2  Exit");
	}
}

class C2 extends Thread {  // Thread Interface
	public void start() {
		System.out.println("C2..visible");
		for (int k = 1; k <= 10; k++) {
			System.out.println(k);
		}
		System.out.println("C2  Exit");
	}
}

public class MultiThreadDemo2 {

	public static void main(String[] args) {

		A2 obj1 = new A2();
		B2 obj2 = new B2();
		C2 obj3 = new C2();

		Thread t1 = new Thread(obj1);
		t1.start();
		obj2.start();
		obj3.start();
	}

}
