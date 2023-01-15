package operators;

public class RightShift {

	public static void main(String[] args) {
		int a = 34;
		int b = -20;
		System.out.println("Signed Right Shift 34 devide by 2= " + (a >> 1));
		System.out.println("Signed Right Shift -20 devide by 2= " + (b >> 1));

	}

}

//  ____,,,,____

//   Right Shift:

//        20>>2=5

//   step : 1 = 20/2^2
//   step : 2 = 20/2x2
//   step : 3 = 20/4
//   step : 4 = 5