package ch11.exercise2;
/**
 자기 자신을 제외한 모든 양의 약수들의 합이 자기 자신이 되는 자연수를 완전수라고 한다.
 	예를 들면, 6과 28은 완전수이다.
 	6=1+2+3 // 1,2,3은 각각 6의 약수
	28=1+2+4+7+14 // 1,2,4,7,14는 각각 28의 약수
 10000 미만의 완전수는 모두 4개가 있다. 이 완전수를 구하는 프로그램을 작성하시오.
 */
public class Q05_PerfectNumber {

	public static void main(String[] args) {
		int num;
		
		for (int i = 2; i < 10000; i++) {
			if (isPerfectNumber(i))
				System.out.println(i);
		}
		
		// 이중 for문
//		for (int i = 2; i < 10000; i++) {
//			int sumOfDivisors = 0;
//			for (int j = 1; j < i; j++) {
//				if (i % j == 0)
//					sumOfDivisors += j;
//			}
//			if (i == sumOfDivisors)
//				System.out.println(i);
//		}
	}
	
	static boolean isPerfectNumber(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return num == sum;
	}
	
	
}
