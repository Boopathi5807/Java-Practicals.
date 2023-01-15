package string;

public class Assignment_5 {

	public static void main(String[] args) {
		String str = "welcomeinedubridgefamily";
		int count = 1;
		int i, j;

		char String[] = str.toCharArray();

		for (i = 0; i < str.length(); i++) {
			if (String[i] != '0' && String[i] != ' ') {
				count = 1;
				for (j = i + 1; j < str.length(); j++) {
					if (String[i] == String[j]) {
						count++;
						String[j] = '0';
					}
				}
				System.out.println(String[i] + "-" + count);
			}
		}
	}

}
