package string;

//In string Class the Merge() method use to merge two StringJoiners
import java.util.*;

public class StringJoinerMergeDemo {

	public static void main(String[] args) {
		StringJoiner name = new StringJoiner(",", "[", "]");// StringJoiner
		name.add("Selva");
		name.add("Boopathi");
		name.add("Aashik");
		name.add("Ashvin");

		StringJoiner name2 = new StringJoiner(",", "& ", " &");// StringJoiner
		name2.add("Ajith");
		name2.add("Ashwin");
		name2.add("Mirunalini");

		StringJoiner merge = name.merge(name2);// merge() method
		System.out.println(merge);
		System.out.println("***************************************************************");

		StringJoiner merge2 = name2.merge(name);// merge() method
		System.out.println(merge2);
	}

}