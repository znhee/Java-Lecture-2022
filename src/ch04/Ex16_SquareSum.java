package ch04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 제곱의 합, 합의 제곱 구하기 
 */

public class Ex16_SquareSum {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("10보다 큰 정수를 입력하시오 > ");
			num = scan.nextInt();
		} while (num <= 10);
		
		int sum = 0, sumOfSquare = 0;
		for (int i=1; i<=num; i++) {
			sum += i;
			sumOfSquare += i*i;
		}	
			
			
		System.out.println("Sum of Square : " + sumOfSquare);
		System.out.println("Square of Sum : " + sum * sum);
	}

}
