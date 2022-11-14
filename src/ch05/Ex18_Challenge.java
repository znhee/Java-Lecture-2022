package ch05;

import java.util.ArrayList;

/**
 * 두 개의 양의 정수를 커맨드 아규먼트로 입력받아서
 * 최대 공약수를 찾아서 배열에 넣어보기
 */

public class Ex18_Challenge {

	public static void main(String[] args) {
		// Step 1. 두 개의 양의 정수를 argument로 입력받아 각각 num1, num2 변수에 넣기
		int num1 = Integer.parseInt(args[0]);		// 문자열 숫자를 정수로 변환 
		int num2 = Integer.parseInt(args[1]);		// 문자열 숫자를 정수로 변환 
		
		// Step 2. 두 수 중 작은 수만큼 for - loop를 돌면서 num1, num2로 나누어지는지 확인 
		int temp = 0;
		if (num1 > num2) {
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		
		ArrayList division = new ArrayList();
		for (int i=1; i <= num1; i++) {
			if(num1 % i == 0 & num2 % i == 0)
				division.add(i);
		}
		System.out.println(division);
		
	}
}
