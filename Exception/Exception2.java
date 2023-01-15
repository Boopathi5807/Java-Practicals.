package exception;

public class Exception2 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int c = 0;
		try {
			int arr[] = null;
			System.out.println(arr[1]);
			c = a / b;
		} catch (ArithmeticException e) {
			System.err.println("Arithmatic Exception has Occurred ");
		} catch (NullPointerException e) {
			System.out.println("Null pointer Exception has occurred");
		} catch (Exception e) {
			System.out.println("Error Occurred");
		}
		System.out.println(c);
		System.out.println("End of program");

	}

}
