package exercise.ch05;

import java.util.Scanner;

public class Q09_Grade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		int studentNum = 0;
		int[] scores = null;
		int max = 0;
		int sum = 0;
		
		while (run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------------------");
			
			System.out.print("선택 > ");
			int button = scan.nextInt();
			
			if (button == 1) {
				System.out.print("학생수 > ");
				studentNum = scan.nextInt();
				scores = new int[studentNum];
			}
			else if (button == 2) {
				for (int i=0; i<studentNum; i++) {
					System.out.print("scores[" + i + "]> ");
				scores[i] = scan.nextInt();
				}
			}
			else if (button == 3) {
				for (int i=0; i<studentNum; i++) 
					System.out.println("scores[" + i + "]> " + scores[i]);
			}
			else if (button == 4) {
				for (int i=0; i<studentNum; i++) {
					if (scores[i] > max)
						max = scores[i];
					sum += scores[i];
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수: " + (double) sum / studentNum);
			}
			else if (button == 5)
				run = false;
			}

		System.out.println("프로그램 종료");
	}

}
