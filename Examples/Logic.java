package work;

public class Logic {

	public static void main(String[] args) {
		int num = 12345, remaining, sum = 0;
		while (num > 0) {
			remaining = num % 10;
			sum = sum + (remaining * remaining);
			num = sum / 10;
		}
		System.out.println(num);

	}

}
