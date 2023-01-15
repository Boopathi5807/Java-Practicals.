package string;

public class StringDemo {

	public static void main(String[] args) {
		String a1 = "Java";                                 //string literal
		char b[] = { 'S', 't', 'r', 'i', 'n', 'g', 's' };   
		String a2 = new String(b);                          // Converting Java Array to String  ,   Creates two objects and one reference variable
		String a3 = new String("Example");                  // Creating java string by new Keyword 
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

	}

}
