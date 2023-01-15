package collection;

import java.util.*;

public class ArrayLinkedVectorLists {

	public static void main(String[] args) {

		ArrayList<String> obj = new ArrayList<String>();// only character

		obj.add("Java");
		obj.add("Full");
		obj.add("Stack");
		System.out.println("The value obj  :" + obj);
		System.out.println("The value 2 in obj  :" + (obj.get(0)));// get value from list

		// linkedlist
		
		LinkedList<String> a = new LinkedList<String>(); // linking the value by poniter for next data

		a.add(new String("Boopathi"));
		a.add(new String("Ashvin"));
		a.add(new String("Aashik"));
		System.out.println("New linked list Words: " + a);
		System.out.println("New linked list Words: " + (a.get(2)));

		// Vector list
		
		Vector<String> s1 = new Vector<String>();

		s1.add("Java");
		s1.add("Css");
		s1.add("Html");
		s1.add("Java Script");
		s1.add(3, "Data Mining");
		System.out.println("Properties of TreeSet :" + s1);// add the word before location
		System.out.println("Properties of TreeSet :" + s1.size());// total length of words present in string

	}
}