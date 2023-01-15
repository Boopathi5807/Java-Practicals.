package work;

public class Prime {

	public static void main(String[] args) {

		int i, m = 0, flag = 0;
		int n = 3;
		m = n / 2;
		if (n == 0 || n == 1)
			System.out.println(n + "nt prime");
		else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0)
					System.out.println(n + "not prime");
				flag = 1;
				break;

			}
		}
		if (flag == 0)
			System.out.println(n + "is prime");

		/*
		 * int n = 5; int c = 0; for (int i = 1; i <= n; i++) if (n % i == 0) c++; if (c
		 * == 2) System.out.println(n + "prime"); else System.out.println(n +
		 * "not prime");
		 */

	}
}
