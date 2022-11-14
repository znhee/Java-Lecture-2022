package ch17_stream.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q08_Example {

	public static void main(String[] args) {
		List<Q08_Member> list = Arrays.asList(
				new Q08_Member("홍길동", "개발자"),
				new Q08_Member("김나리", "디자이너"),
				new Q08_Member("신용권", "개발자")
				);
		
		Map<String, List<Q08_Member>> groupingMap = list.stream()
													.collect(Collectors.groupingBy(s -> s.getJob()));
		System.out.println("[개발자]");
		groupingMap.get("개발자").stream()
					.forEach(m -> System.out.println(m));
		System.out.println();
		
		System.out.println("[디자이너]");
		groupingMap.get("디자이너").stream()
					.forEach(m -> System.out.println(m));
	}

}
