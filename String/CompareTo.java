package string;

//In String compareTo() method used to compare the letter at alphabet base. 
public class CompareTo {

	public static void main(String[] args) {
		String Name = "aashik";

		String Name1 = "aashik";

		String Name2 = "ashvin";

		String Name3 = "aashik";

		String Name4 = "Boopathi";

		System.out.println("compare Name1 and Name String :" + Name1.compareTo(Name));// compareTo() method

		System.out.println("compare Name3 and Name4 String :" + Name3.compareTo(Name4));

		System.out.println("compare Name4 and Name1 String :" + Name4.compareTo(Name1));

		System.out.println("compare Name3 and Name2 String :" + Name3.compareTo(Name2));
	}

}
