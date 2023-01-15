package work;

public class IncrementDecrement {

	public static void main(String[] args) {
		int a = 3, b = 4, c;
		c = a + b + a++ + b++ + ++a + ++b;
		System.out.println(c);
		System.out.println(a);

	}

}

//       ++a = pre Increment
//       a++ = Post Increment
//       --a = pre Decrement
//       a-- = post Decrement