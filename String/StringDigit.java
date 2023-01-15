package string;

public class StringDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digitCount = 0;
		int alphaCount = 0;
		String s = "aashik786";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				digitCount++;
			}
			if (Character.isAlphabetic(ch)) {
				alphaCount++;
			}
		}
		System.out.println("Total Number of Digit Value " + digitCount);
		System.out.println("Total Number of Numeric Value " + alphaCount);
	}

}
