package statements;

import java.util.Scanner;

public class JumpStatement {

	public static void main(String[] args) {
		/* BREAK_STATEMENT */
		int n = 55;
		while (true/* n>=0 */) {
			if (n % 10 == 0) {

				System.out.println(n);
				break;
			}
			n--;
		}

		double m, sum = 0.0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number. enter a negative number to stop:\n  ");

		while (true) {
			m = scanner.nextDouble();
			if (m < 0.0) {
				break;
			}

			sum = sum + m;
		}
		System.out.println("sum is " + sum);

		/* CONTINUE_STATEMENT */
		int k = 1;
		for (k = 1; k <= 10; k++) {
			if (k == 7 | k == 8)
				continue;
			System.out.println(k);

		}
	}

}
