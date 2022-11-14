package ch06;

public class Ex15_Static {
	static double pi = 3.14159;
	static final double PI = 3.14159;	// final field -> 불변
	int x;								// instance field(변수) 
	
	static int power(int base, int exp) {
		int res = 1;
		for(int i=1; i <= exp; i++)
			res *= base;
		return res;
	}
	
	static double circleArea(double radius) {
		return pi * radius * radius;
	}
	
	int power2() {						// instance method -> static 변수 사용 가능
		int res = 1;
		System.out.println(pi);
		for (int i = 1; i <= x; i++)
			res *= 2;
		return res;
	}
}
