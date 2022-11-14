package ch04;

import java.util.Scanner;

/**
 * 별 모양으로 다이아몬드 그리기 
 */
public class Ex22_Star {
	
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("8보다 작은 정수를 입력하시오 > ");
			num = scan.nextInt();
		} while (num <= 10);
		
		// 1사분면 
		System.out.println("1사분면");
		for (int i = 1; i <= num; i++) {		// i : 1 ~ 5
			for (int j = 1; j <= i; j++) 	// k : i번 만큼 
				System.out.print("*");
			System.out.println();
		}
		
		// 4사분면 
		System.out.println("4사분면");
		for (int i = num; i >= 1; i--) {		// i : 5 ~ 1 
			for (int j = 1; j <= i; j++)	// j : i번 만큼 
				System.out.print("*");
			System.out.println();
		}
		
		// 2사분면
		System.out.println("2사분면");
		for (int i = 1; i <= num; i++) {			// i : 1 ~ 5
			for (int j = 1; j <= num - i; j++)		// blank : num - i번 만큼 
				System.out.print(" ");
			for (int j =1; j <= i; j++)				// * : i번 만큼 
				System.out.print("*");
			System.out.println();
		}
		
		// 3사분면 
		System.out.println("3사분면");
		for (int i = num; i >= 1; i--) {			// i : 5 ~ 1
			for (int j = 1; j <= num - i; j++)		// j : num - i번 만큼 
				System.out.print(" ");		
			for (int j = 1; j <= i; j++)			// * : i번 만큼 
				System.out.print("*");
			System.out.println();
		}
	}

}
