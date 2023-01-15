package string;

import java.util.Scanner;

public class Assignment_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("enter a String");
		String str = sc.nextLine();
		String[] s = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			char[] c = s[i].toCharArray();
			int l = c.length;
			if (c[l - 1] == 'm' || c[l - 1] == 'n' || c[l - 1] == 'M' || c[l - 1] == 'N') {
				count++;
			}
		}
		System.out.println("the number of words ends with 'm' or 'n' are :" + count);

	}

}
