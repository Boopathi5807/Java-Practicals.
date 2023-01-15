package operators;

public class IncrementDecrement {

	public static void main(String[] args) {
		int a = 40;
		int b = 50;
		System.out.println("Value of a" + a);
		System.out.println("Value of b" + b);

		System.out.println("Value of --a" + (--a));
		System.out.println("Value of a" + a);
		System.out.println("Value of b--" + (b--));
		System.out.println("Value of b" + b);

	}

}

//                    -----------...---------

//                            Increment
//       Prefix Increment                     Postfix Increment

//             ++a                                  a++

//       Increment a by 1                     Use  the  current
//       then use the new                     value of a in the   
//       value f a in the                     expression , then
//       expression.                          increment a by 1.  

//                            Decrement
//       Prefix Decrement                     Postfix Decrement

//             --a                                   a--

//       Decrement a by 1                      Use the current  
//       then use the new                      value f a in the
//       value f a in the                      expression, then
//       expression.                           decrement a by 1.