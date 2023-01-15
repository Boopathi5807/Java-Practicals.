package statements;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		int a, b;
		Scanner i = new Scanner(System.in);
		System.out.println("enter first number: ");
		a = i.nextInt();
		System.out.println("enter second number: ");
		b = i.nextInt();
		char operator;
		System.out.println("enter the operator +,-,*,/,%: ");
		operator = i.next().charAt(0);

		switch (operator) {
		case '+':
			System.out.println(a + "+" + b + " = " + (a + b));
			break;
		case '-':
			System.out.println(a + "-" + b + " = " + (a - b));
			break;
		case '*':
			System.out.println(a + "*" + b + " = " + (a * b));
			break;
		case '/':
			System.out.println(a + "/" + b + " = " + (a / b));
			break;
		case '%':
			System.out.println(a + "%" + b + " = " + (a % b));
			break;
		default:
			System.out.println("you have enter incorrect simbole");
		}
	}

}
