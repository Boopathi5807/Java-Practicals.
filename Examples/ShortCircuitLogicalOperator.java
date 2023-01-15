package work;

import java.util.Scanner;

public class ShortCircuitLogicalOperator {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("enter value");
		long a = i.nextLong();
		long a1 = i.nextLong();
		System.out.println("a value is =" + ((a > 20) || (a < 30)));
		System.out.println("a1 value is =" + ((a > 20) && (a > 30)));
	}

}

//    && , || .  