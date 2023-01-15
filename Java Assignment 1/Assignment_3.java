package string;

public class Assignment_3 {

	public static void main(String[] args) {
		String str = "Welcome to Welcome Bike Bike";

		// Approach-1

		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char) c));
		System.out.println(sb1);

		// Approach-2
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int idx = str.indexOf(ch, i + 1);
			if (idx == -1) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);

	}

}
