package java8features;

import java.util.function.Predicate;

public class LambdaDem {

	public static void main(String[] args) {
		int arrays[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Predicate<Integer> even = x -> x % 2 == 0;
		Predicate<Integer> add = y -> y > 5;
		for (int i : arrays) {
			if (add.or(even).test(i)) {
				System.out.println(i);
			}
		}

	}

}
