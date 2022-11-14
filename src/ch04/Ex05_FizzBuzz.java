package ch04;

import java.util.Random;
import java.util.Scanner;

public class Ex05_FizzBuzz {

	public static void main(String[] args) {
		// 임의의 정수값을 생성
		Random ran = new Random();				// 객체 생성 
		int number = ran.nextInt(100) + 1;		// 1부터 100까지 임의의 숫자 할당
		
		System.out.print("1에서 100 사이의 정수를 입력하세요 > ");
		Scanner scan = new Scanner(System.in);	// 객체 생성 
		int num = scan.nextInt();
		number = num;
		
		if (number % 15 == 0)
			System.out.println(number + ", FizzBuzz");
		else if (number % 5 == 0)
			System.out.println(number + ", Buzz");
		else if (number % 3 == 0)
			System.out.println(number + ", Fizz");
		else
			System.out.println(number + ", " + number);
	}

}
