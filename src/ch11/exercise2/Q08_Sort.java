package ch11.exercise2;

import java.util.Arrays;

public class Q08_Sort {

	public static void main(String[] args) {
		int[] a = {29, 64, 52, 38, 77, 40};
		System.out.println(Arrays.toString(a));
		
		// 오름차순
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) { 			// swaping
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}
		System.out.println("오름차순: " + Arrays.toString(a));
		
		// 내림차순
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) { 			// swaping
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}
		System.out.println("내림차순: " + Arrays.toString(a));
	}

}
