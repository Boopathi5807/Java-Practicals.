package string;

import java.util.Scanner;

public class Assignment_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		String s = "";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				if (i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
					s = s + str.charAt(i);

				} else {
					s = s + str.charAt(i);
					sum = sum + Integer.parseInt(s);
					s = "";
				}
			}
		}
		System.out.println("Sum of Numbers in the String :" + sum);

	}

}
