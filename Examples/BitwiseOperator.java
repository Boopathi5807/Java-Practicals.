package work;

public class BitwiseOperator {

	public static void main(String[] args) {

		int a = -5, b = 4;

		System.out.println(~a + (a & b));
		System.out.println(a ^ b);
		System.out.println(a | b);

		System.out.println(b >>> 20);
		System.out.println(a >>> 20);
		System.out.println(a >> 1);
		System.out.println(a >>> 1);
		a = a - b;
		System.out.println(a >>> 20);
		boolean c = true, d = false;
		System.out.println(c | d);
	}

}

//     Bitwise_Operator
// 1)   & , | , ^ , ~ .
// 2)   << , >> , >>>