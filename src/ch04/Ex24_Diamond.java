package ch04;

import java.util.Scanner;

/**
 * 완성된 다이아몬드 그리기 
 * 						half = num / 2
 *     *				i : 1, 2, 3, 4 	   -> 	1 ~ half + 1
 *    ***				space : 3, 2, 1, 0 ->   half + 1 - i
 *   *****				* : 1, 3, 5, 7 	   ->   (2 * i) - 1
 *  *******				num = 7  
 *   *****				i : 1, 2, 3 	   ->   1 ~ half
 *    ***				space : 1, 2, 3	   ->   i
 *     *				* : 5, 3, 1		   ->   2 * (half - i) + 1
 */

public class Ex24_Diamond {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("10보다 작은 홀수를 입력하시오 > ");
			num = scan.nextInt();
		} while (num > 10);
		
		int half = num / 2;
		
		for (int i = 1; i <= half+1; i++) {
			for (int j= 1; j <= half + 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= half; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * (half - i) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
