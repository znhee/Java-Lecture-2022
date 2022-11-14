package ch05;

import java.util.Arrays;
import java.util.Random;

/**
 * length가 30인 정수형 배열 score에
 * 100보다 작은 임의의 정수값을 입력하고
 * 이 배열에서 가장 큰 수를 찾기
 */

public class Ex17_Max {

	public static void main(String[] args) {
		int[] score = new int[30];
		Random ran = new Random();
		for (int i=0; i < score.length; i++) 
			score[i] = ran.nextInt(100);
		System.out.println(Arrays.toString(score));
		
		int max = 0;
		for(int i=0; i < score.length; i++)
			if (score[i] > max)
				max = score[i];
		System.out.println(max);
		
		int min = 100;
		for (int i=0; i < score.length; i++)
			if (score[i] < min)
				min = score[i];
		System.out.println(min);
	}

}
