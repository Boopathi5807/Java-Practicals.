package string;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to Java Full Stack Development Course";
		String str[] = s.split(" ");

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

}
