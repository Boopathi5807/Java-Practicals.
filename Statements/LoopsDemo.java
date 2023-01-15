package statements;

import java.util.Scanner;

public class LoopsDemo {

	public static void main(String[] args) {
		int i = 1;
		int n;
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Hw many stars do you want ");
		n = Scanner.nextInt();

		do {
			System.out.println("*");
			i++;
		} while (i <= n);

	}

}
