package ch04;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * 만 나이 계산하기 i
 * 
 * 생년월일을 입력으로 받아, 오늘 현재 만 나이를 구하기 
 */

public class Ex06_FullAge {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	// 객체 생성 
		System.out.print("생년 > ");
		int bYear = scan.nextInt();
		System.out.print("생월 > ");
		int bMonth = scan.nextInt();
		System.out.print("생일 > ");
		int bDay = scan.nextInt();
		
		LocalDate birthDay = LocalDate.of(bYear, bMonth, bDay);
		System.out.println("생년월일 : " + birthDay);
		
		LocalDate today = LocalDate.now();
		System.out.println("오늘날짜 : " + today);
		int tYear = today.getYear();
		int tMonth = today.getMonthValue();
		int tDay = today.getDayOfMonth();
		
		if (tMonth >= bMonth) {
			if (tDay >= bDay)
				System.out.printf("만나이 : %d",tYear - bYear);
			else
				System.out.printf("만나이 : %d",tYear - bYear - 1);
		}
		else
			System.out.printf("만나이 : %d", tYear - bYear - 1);

	}

}
