package java8features;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {

		Function<String, Integer> object = (name) -> name.length();
		System.out.println(object.apply("S.Boopathi"));

		Function<Integer, Integer> object1 = (number) -> number + number;
		System.out.println(object1.apply(10));

		Function<Integer, Integer> object2 = (number) -> number * number;
		System.out.println(object2.apply(100));

		System.out.println(object2.andThen(object1).apply(4)); // go first object2 and then go object1 = andthen()
		System.out.println(object2.compose(object1).apply(2)); // go first object1 and then go object2 = compose()

	}

}
