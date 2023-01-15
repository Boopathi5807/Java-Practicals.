package work;

import java.util.Scanner;

public class InputDemo {
	public static void main(String args[]) {
		Scanner i = new Scanner(System.in);
		System.out.println("Name=");
		String j = i.nextLine();
		System.out.println("EmailID=");
		String k = i.nextLine();
		System.out.println("Password=");
		long l = i.nextLong();
		i.nextLine();
		System.out.println("Name is :" + j);
		System.out.println("Enter Email ID :" + k);
		System.out.println("Your Password is :" + l);

	}

}