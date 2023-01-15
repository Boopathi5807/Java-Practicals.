package java8features;

import java.util.UUID;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<Double> a1 = () -> Math.random();
		System.out.println(a1.get());

		Supplier<String> s1 = () -> UUID.randomUUID().toString();
		System.out.println(s1.get());

	}

}
