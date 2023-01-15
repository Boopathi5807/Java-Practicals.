package string;

//this equal() is boolean method

//it used to compare the two String Values or character or content of the String  

public class Equals {

	public static void main(String[] args) {
		String Name = "ashvin";// String object 1
		String Name1 = "aashik";// String object 2

		if (Name.equals(Name1)) // using equals() method at if condition Becase the Equal() is boolean(true or
								// false)

		{
			System.out.println("the two String Are Equal");
		}

		else {
			System.out.println("the two String are not Equal");
		}
	}

}