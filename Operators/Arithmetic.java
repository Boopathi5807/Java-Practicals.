package operators;

public class Arithmetic {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;

		int rem = 10 & 20;
		System.out.println("Sum of a and b " + sum);
		System.out.println("Subtraction of a and b " + sub);
		System.out.println("Multiplication of a and b " + mul);
		System.out.println("Division of a and b " + div);
		System.out.println("Modulus of a and b " + rem);

	}

}

//       -----------...---------

// operator   Meaning               Example    Result
// +          Addition              10+2       12
// -          Subtraction           10-2       8
// *          Multiplication        10*2       20
// /          Division              10/2       5
// %          Modulus(remainder)    10%2       0
// ++         Increment             10++       11
// --         Decrement             10--       9                                    