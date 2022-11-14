package ch17_stream;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Ex12_Aggregate {

	public static void main(String[] args) {
		int[] intArr = {1, 3, 6, 2, 8};
		
		// 2의 배수의 개수
		long count = Arrays.stream(intArr)
						   .filter(n -> n % 2 == 0)
						   .count();
		System.out.println(count);
		
		// 합계
		int sum = Arrays.stream(intArr)
						.filter(n -> n % 2 == 0)
						.sum();
		System.out.println(sum);
		
		// 평균
		double avg = Arrays.stream(intArr)
						   .filter(n -> n % 2 == 0)
						   .average()
						   .getAsDouble();
		System.out.println(avg);
		
		// 최대값
		int max = Arrays.stream(intArr)
						.filter(n -> n % 2 == 0)
						.max()
						.getAsInt();
		System.out.println(max);
		
		// 최소값
		int min = Arrays.stream(intArr)
				.filter(n -> n % 2 == 0)
				.min()
				.getAsInt();
		System.out.println(min);
		
		// Optional
		// 5의 배수의 평균
//		double average = Arrays.stream(intArr)
//							   .filter(n -> n % 5 == 0)
//							   .average()		// NoSuchElementException 발생
//							   .getAsDouble();
//		System.out.println(average);
		
		// 해결 방법 1
		OptionalDouble optional = Arrays.stream(intArr)
				   						.filter(n -> n % 5 == 0)
				   						.average();
		if (optional.isPresent())
			System.out.println("방법 1 - 평균: " + optional.getAsDouble());
		else
			System.out.println("방법 1 - 평균: 0.0");
		
		// 해결 방법 2
		double average = Arrays.stream(intArr)
						   		.filter(n -> n % 5 == 0)
						   		.average()
						   		.orElse(0.0);
		System.out.println("방법 2 - 평균: " + average);
		
		// 해결 방법 3 - 권장
		Arrays.stream(intArr)
			.filter(n -> n % 5 == 0)
			.average()
			.ifPresent(d -> System.out.println("방법 3 - 평균: " + d));
	}

}
