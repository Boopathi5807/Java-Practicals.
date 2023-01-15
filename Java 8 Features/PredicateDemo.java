package java8features;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> p1 = x -> x > 25;
		Predicate<Integer> p2 = y -> y > 30;

		System.out.println(p1.test(26));
		System.out.println(p2.test(10));
		System.out.println(p1.or(p2).test(30));
		System.out.println(p1.and(p2).test(30));
		System.out.println(p1.negate().test(30));

	}

}
