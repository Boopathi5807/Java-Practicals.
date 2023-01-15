package operators;

public class Relational {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("a==b=" + (a == b)); // false
		System.out.println("a!=b=" + (a != b)); // true
		System.out.println("a>b=" + (a > b)); // false
		System.out.println("a<b=" + (a < b)); // true
		System.out.println("b>=a=" + (b >= a)); // true
		System.out.println("b<=b=" + (b <= a)); // false

	}

}

//            -----------...---------

//      Operator      Meaning            Example

//      ==            equal to           (A == B) is not true.

//      !=            not equal to       (A != B) is true.

//      >             greater than       (A > B)  is not true.

//      <             less then          (A < B)  is true.

//      >=            greater than       (A >= B) is not true.  
//                    or equal to

//      <=            less than or       (A <= B) is true.  
//                    equal to