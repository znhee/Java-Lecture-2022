package ch04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 약수 구하기
 */
public class Ex15_Division {

	public static void main(String[] args) {
		int number;
		Scanner scan = new Scanner(System.in);	// 객체 생성 
		while(true)
		{
			System.out.print("10보다 큰 정수를 입력하세요 > ");
			number = scan.nextInt();
			if (number > 10)
				break;
		}
		scan.close();
		
		ArrayList division = new ArrayList();
		for(int i=1; i<=number; i++) {
			if(number % i == 0)
				division.add(i);
		}
		System.out.println(division);
	}
}
