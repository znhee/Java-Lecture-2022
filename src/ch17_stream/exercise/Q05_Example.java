package ch17_stream.exercise;

import java.util.Arrays;
import java.util.List;

public class Q05_Example {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
				);
		boolean a = "This is a java book".toLowerCase().indexOf("java") >= 0;
		System.out.println(a);
		
		list.stream()
			.filter(s -> s.toLowerCase().indexOf("java") >= 0)
//			.filter(s -> s.toLowerCase().contains("java"))
			.forEach(s -> System.out.println(s));
				
	}
}
