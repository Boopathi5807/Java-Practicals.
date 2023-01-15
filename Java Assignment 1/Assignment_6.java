package string;

import java.util.Scanner;

public class Assignment_6 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		str = sc.next();
		StringBuilder rev = new StringBuilder(str);
		StringBuilder reverse = rev.reverse();
		String strrev = reverse.toString();
		if (str.equals(strrev)) {
			System.out.println(strrev + " is a palindrme");

		} else {
			System.out.println(strrev + " is not a palindrme");
		}

	}

}
