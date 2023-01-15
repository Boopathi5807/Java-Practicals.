package statements;

public class LoopsStatements {

	public static void main(String[] args) {
		int i;
		int k = 3;
		for (i = 1; i <= 50; i++) {
			System.out.println("i");

		}

		System.out.print(" outside the loop i is  " + i);
		int j = 4;
		while (j <= 6) {
			System.out.println(j);
			j++;

		}
		do {
			System.out.println(k);
			k++;
		} while (k <= 5);
	}

}
