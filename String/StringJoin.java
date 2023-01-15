package string;

import java.util.StringJoiner;

public class StringJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List<Integer> list = new ArrayList<Integer>();
		StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter
		// Adding values to StringJoiner
		joinNames.add("Boopathi");
		joinNames.add("Aswin");
		joinNames.add("Aashik");
		joinNames.add("Logesh");
		
		System.out.println(joinNames);
	}

}
