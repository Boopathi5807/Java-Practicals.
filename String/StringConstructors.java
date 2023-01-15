package string;

public class StringConstructors {

	public static void main(String[] args) {
		
		
		/*  String s=new String();  */
		
		char chars[] = { 'h', 'e', 'l', 'l', 'o' };
		String s = new String(chars);                     // String initialized by an array of characters
		System.out.println("String is : " + s);
		
		
		/* String s= new String(char chars[],int startIndex, int numChars); */

		char chars1[] = { 'h', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!' };
		String s2 = new String(chars1, 0,10);
		System.out.println("String is :" + s2);
		
		
		/*  String s=new String(String StrObj);  */
		
		char chars2[] = { 'h', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!' };
		String s1 = new String(chars2);
		System.out.println("String is : " + s1);
		String s3 = new String(s1);
		System.out.println("String is : " + s3);
		
		
		/* String s= new String(byte asciiChar[],int staetIndex, int numChars); */
		
		byte ascChars[]= {65,66,67,68,69,70};
		String s4=new String(ascChars);
		System.out.println("String is :"+s4);
		String s5=new String(ascChars,2,3);
		System.out.println("String is :"+s5);

	}

}
