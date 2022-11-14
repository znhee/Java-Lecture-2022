package ch04;

/**
 * 1에서 100까지의 3의 배수를 제외한 합계 
 */

public class Ex14_Continue {

	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=100; i++) {
			if (i % 3 == 0)
				continue;
			sum += i;
		}
		System.out.println(sum);
		sum = 0;
		
	// 1에서 100까지의 3의 배수 합
		for (int i=3; i<=100; i+=3) 
			sum += i;
		System.out.println(5050 - sum);
		
		for (int i=99; i>0; i-=3) 
			sum += i;
		System.out.println(5050 - sum);
	}
}
