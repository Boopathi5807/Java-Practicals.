package work;

class mobile {
	private String empname;
	private int empid;

	mobile(){
		System.out.println("i am default constructor");
		empname="boopathi";
		empid=123;
	}
	mobile(String name,int id){
		System.out.println("i am with parameeter constructor");
		empname=name;
		empid=id;
	}
	void mobilee (){
		System.out.println(empname);
		System.out.println(empid);
	}
}

public class MSB {
	public static void main(String[] args) {

		System.out.println("Welcome");

		System.out.println();
		mobile m1=new mobile();
		m1.mobilee();
		
		System.out.println();
		mobile m2=new mobile("boopathi",177513);
		m2.mobilee();
	}
}