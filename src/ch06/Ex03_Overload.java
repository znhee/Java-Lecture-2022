package ch06;

/**
 * Method over loading
 */

public class Ex03_Overload {

	public static void main(String[] args) {
		int min = getMin(3, 4, 5);
		System.out.println(min);
		System.out.println(getMin(10., 20., 5.));
		System.out.println(getMin(100, 83, 145));
		System.out.println(getMin(15, 39));
	}
	
	static int getMin(int a, int b) {
		return getMin(a, a, b);
	}
	
	static int getMin(int a, int b, int c) {
		int min = (a < b) ? a : b;
		min = (min < c) ? min : c;
		
		return min;
	}
	
	static double getMin(double a, double b, double c) {
		double min = (a < b) ? a : b;
		min = (min < c) ? min : c;
			
		return min;	
	}
}
