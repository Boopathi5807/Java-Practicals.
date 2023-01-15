package operators;

public class Logical {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 15;
		int d = 20;
		System.out.println("Value of a " + a);
		System.out.println("Value of b " + b);
		System.out.println("Value of c " + c);
		System.out.println("Value of d " + d);

		boolean result = !((a < b) || (c > d));

		System.out.println(result);
	}
}

//              -----------...---------

//                Logical Operators

//     Operator         Meaning
//        &&          Logical AND
//        ||          Logical OR
//        !           Logical NOT

//     Logical Operators return results:
//  Following Table:

//          x          Y          X && Y           X || Y
//          T          T             T                T
//          T          F             F                T
//          T          T             F                T
//          T          F             F                F