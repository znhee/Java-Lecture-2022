package ch03;

public class Ex02_Unary {

	public static void main(String[] args) {
		boolean a = true;
		System.out.println(!a);
		
		int b = 3;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(~b));		// bitwise 반전 
		System.out.println(Integer.toBinaryString(-b));
		System.out.println(Integer.toHexString(-b));		// 16진수 
	}

}
