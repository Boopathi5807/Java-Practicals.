package statements;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		int mark;
		Scanner a = new Scanner(System.in);
		System.out.println("enter your mark(0-100)");
		mark = a.nextInt();

		if (mark >= 90)
			System.out.println("A");
		else if (mark >= 80)
			System.out.println("B");
		else if (mark >= 70)
			System.out.println("C");
		else if (mark >= 60)
			System.out.println("D");
		else
			System.out.println("E");

	}

}
