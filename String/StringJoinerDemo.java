package string;

import java.util.*;

public class StringJoinerDemo {

	public static void main(String[] args) {
		StringJoiner sb = new StringJoiner(",");

		sb.add("Boopathi");
		sb.add("Aashik");
		sb.add("Ajith");
		System.out.println(sb);

	}

}