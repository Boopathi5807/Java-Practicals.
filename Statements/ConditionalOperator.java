package statements;

public class ConditionalOperator {

	public static void main(String[] args) {
		int a = 45, b = 60;
		int max;
		if (a > b)
			max = a;
		else
			max = b;
		
		max = (a > b) ? a : b;
		System.out.println(max);
	}

}
