package ch06;

/**
 * Method : 다른 언어에서는 함수 역할 
 */

public class Ex01_Method {

	public static void main(String[] args) {
		int min = getMin(3, 4, 5);
		System.out.println(min);
		System.out.println(getMin(10, 20, 5));
		System.out.println(getMin(100, 83, 145));
	}
	
	static int getMin(int a, int b, int c) {
		int min = (a < b) ? a : b;
		min = (min < c) ? min : c;
		
		return min;
	}
}
