package work;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		int num;
		Scanner i = new Scanner(System.in);
		System.out.println("Enter a Number");
		num = i.nextInt();
		if (num > 0) {
			System.out.println(num + " is positive");

		} else {

			if (num == 0) {
				System.out.println(num + " is neutural");

			} else {
				System.out.println(num + " is negative");
			}
		}

	}

}
