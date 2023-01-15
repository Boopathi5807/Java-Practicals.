package multithread;


/* ...........................Extending the Runnable class...............................*/


class A1 implements Runnable {
	public void run() {
		System.out.println("Thread A1 is start");
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);				
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("thread A1." + i);
		}
		System.out.println("thread A1 is Exit...");
	}
}

class B1 implements Runnable {
	public void run() {
		System.out.println("Thread B1 is start");
		for (int j = 1; j <= 10; j++) {
			System.out.println("thread B1." + j);
		}
		System.out.println("thread B1 is Exit...");
	}
}

class C1 implements Runnable {
	public void run() {
		System.out.println("Thread C1 is start");
		for (int k = 1; k <= 10; k++) {
			System.out.println("thread C1." + k);
		}
		System.out.println("thread C1 is Exit...");
	}
}

public class MultiThread1 {

	public static void main(String[] args) {

		A1 obj1 = new A1();
		B1 obj2 = new B1();
		C1 obj3 = new C1();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);

		t1.start();
		t2.start();
		t3.start();

	}

}
