package exception;

class MobileNotAllowed extends Exception {

	public MobileNotAllowed(String message) {
		super(message);
	}
}

public class ThrowKeyword {
	public void useMobile(int hours) throws MobileNotAllowed {
		if (hours > 6) {
			throw new MobileNotAllowed("you are not allwed to use Mobile more than 6 hours");
		} else {
			System.out.println("You are not allwed to use Mobile ");
		}
	}

	public static void main(String[] args) {
		ThrowKeyword obj = new ThrowKeyword();
		try {
			obj.useMobile(7);
		} catch (MobileNotAllowed e) {
			System.out.println("Exception is genarated in main method  " + e);
		}

	}

}
