package string;

import java.util.Scanner;

public class Assignment_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		System.out.println("Enter a String");
		String str = sc.next();
		System.out.println("Enetr a character to check the Equality");
		char c = sc.next().charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				flag = 1;
				if (str.charAt(i + 1) == str.charAt(i - 1)) {
					System.out.println("True");
				}
			}
		}

	}

}
