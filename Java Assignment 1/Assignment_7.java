package string;

import java.util.Scanner;

public class Assignment_7 {

	public static void main(String[] args) {

		String str = "life";
		int count = 0;
		System.out.println("Enter a String ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (int i = 0; i < s.length() - 3; i++) {
			String sub = s.substring(i, i + 4);
			if (str.equals(sub)) {
				count++;
			}
		}
		System.out.println("life Appears " + count + " Times");

	}

}
