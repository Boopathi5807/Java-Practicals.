package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.event.ListSelectionListener;

public class StreamAPIDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(50);
		list.add(60);
		list.add(70);
		list.stream().filter(num -> num > 50).forEach(System.out::println);
		
		List<Integer> collect = list.stream().filter(num -> num > 50).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> value=list.stream().map(num->num*2).collect(Collectors.toList());
		System.out.println(value);
		
		System.out.println();
		list.stream().sorted().forEach(System.out::println);

	}

}
