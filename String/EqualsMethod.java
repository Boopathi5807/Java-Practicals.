package string;

public class EqualsMethod {

	public static void main(String[] args) {

		// -------------Equals---------------//

		String s1 = new String("java");
		String s2 = new String("Java");
		boolean sreult = s1.equals(s2);
		System.out.println(sreult);

		// -------------Equals Ignore Case---------------//

		String s3 = new String("java");
		String s4 = new String("Java");
		boolean result = s3.equalsIgnoreCase(s4);
		System.out.println(result);

		// -------------Compare To---------------//

		String s5 = new String("PHP");
		String s6 = new String("Java");
		int i = s5.compareTo(s6);
		System.out.println(i);

		// -------------Compare To Ignore Case---------------//

		String s7 = new String("java");
		String s8 = new String("Java");
		int j = s7.compareToIgnoreCase(s8);
		System.out.println(j);
	}

}
