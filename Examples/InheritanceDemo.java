package work;

class parant1 {
	void meena() {
		System.out.println("meenatchi");
	}
}

class child2 {
	void siva() {
		System.out.println("siva kumar");
	}
}

class son3 {
	void boopathi() {
		System.out.println("Boopathi");
	}
}

class doctor4 extends child2 {
	void ram() {
		System.out.println("ram");
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		doctor4 m1= new doctor4();
		m1.ram();
	}
}
