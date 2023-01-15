package operators;

public class TernaryorConditional {

	public static void main(String[] args) {

		int a = 2;
		int b = 5;
		int min = (a < b) ? a : b;
		System.out.println(min);

	}

}

//   -----------...---------

//   Syntax  :   C= a>b? A : B

//   Condition? Block 1 : Block 2 
//   Condition are True Execute Block 1. OR
//   Condition are False Execute Block 2.