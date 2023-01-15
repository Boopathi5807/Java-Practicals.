package work;

import java.util.Scanner;

public class OperatorPrecedence {

	public static void main(String[] args) {
		int a = 10, b = 22, c = 60, d = 1523;
		double e = (a * b / c + d) / a - b;
		System.out.println(e);
		int a1 = 15;
		a1 = a1++ + ++a1;
		System.out.println(a1);
		Scanner f = new Scanner(System.in);
		System.out.println("enter value");
		short g = f.nextShort();
		System.out.println(g++ + ++g);

	}

}


//      Operator_Precedence
//      --a * --b * --a * b--