package work;

public class JavaMethods {

	public void retund() {                     // without parameeter & without retuntype
		int a=10,b=20;
		int sum1=a+b;
		System.out.println(sum1);
		
	}
	public int parameeter()   {               // without parameeter & with returntype
		int a=234, b=415;
//	public int parameeter(int a,int b) {      // with parameeter & with returntype
		int sum=a+b;
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {

		JavaMethods m1=new JavaMethods();
		m1.retund();                         // without parameeter & without retuntype.
//		int rv=m1.parameeter(100, 273);      //with parameeter & with returntype.
		m1.parameeter();                     // without parameeter & with returntype.
		
		
	}

}
