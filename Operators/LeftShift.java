package operators;

public class LeftShift {

	public static void main(String[] args) {
		int a = 34;
		int b = -20;
		System.out.println("Signed Left Shift 34 multiply by 2= " + (a << 1));
		System.out.println("Signed Left Shift -20 multiply by 2= " + (b << 1));

	}

}

// ____,,,,____

//  Left Shift:

//              10<<3=80

//   step : 1 = 10*2^3
//   step : 2 = 10*2x2x2
//   step : 3 = 10*8
//   step : 4 = 80.