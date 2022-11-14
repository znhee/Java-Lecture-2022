package ch17_stream.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q07_Example {

	public static void main(String[] args) {
		List<Q07_Member> list = Arrays.asList(
				new Q07_Member("홍길동", "개발자"),
				new Q07_Member("김나리", "디자이너"),
				new Q07_Member("신용권", "개발자")
				);
		
		List<Q07_Member> developers = list.stream()
										  .filter(str -> str.getJob() == "개발자")
										  .collect(Collectors.toList());
		developers
			.stream()
			.forEach(str -> System.out.println(str.getName()));
				
	}

}
