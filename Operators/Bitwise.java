package operators;

public class Bitwise {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		System.out.println("a&b=" + (a & b));
		System.out.println("a|b=" + (a | b));
		System.out.println("a^b=" + (a ^ b));
		System.out.print("~a=" + ~a);
		a &= b;
		System.out.println("a=" + a);

	}

}

//            -----------...---------

//    Bitwise Operator:

//    Operator       Name
//    a&b            and
//    a|b            or
//    a^b            xor
//    ~a             not
//    n<<p           left shift
//    n>>p           right shift
//    n>>>p          Right Shift Zero fill Operator   

//  1) BITWISE OR (|) - 

//      a=5=0101 (In Binary)
//      b=7=0111 (In Binary)

//    Bitwise OR Operator of 5 and 7
//        0101
//        0111
//       ______
//        0111 = 7 (In decimal).

//  2) BITWISE AND (&) -

//      a=5=0101  (In Binary)
//      b=7=0111  (In Binary)

//    Bitwise AND Operation of 5  and 7
//        0101
//     &  0111
//     ________
//        0101 = 5 (In decimal).

//  3) BITWISE XOR (^) -

//      a=5=0101 (In Binary)
//      b=7=0111 (In Binary)

//    Bitwise XOR Operator of 5 and 7
//        0101
//    ^   0111
//    __________
//        0010 = 2 (In decimal).

//   4) BITWISE COMPLEMENT (~) -

//      a=5=0101 (In Binary)

//    Bitwise Compliment Operator of 5

//    ~   0101
//    _________
//        1010 = 10 (In decimal).