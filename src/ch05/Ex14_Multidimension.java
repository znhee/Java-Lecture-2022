package ch05;

import java.util.Arrays;

/**
 * 다차원 배열 
 */

public class Ex14_Multidimension {

	public static void main(String[] args) {
		int[][] matrix = new int[2][3];						// 행의 개수 2, 열의 개수 3
		int[][] score = {{80, 90, 84}, {78, 85, 95}};		// 학생 2명의 국어/영어/수학 성적
		
		System.out.println(score[0][0]);		// 80
		System.out.println(score[1][1]);		// 85
		
		System.out.println(matrix.length);		// 2, 행의 개수
		System.out.println(matrix[0].length);	// 3, 열의 개수
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[0].length; j++)
				System.out.print(score[i][j] + " ");
			System.out.println();
		}		
		System.out.println(Arrays.toString(score));		// 도움 안됨
	}

}
