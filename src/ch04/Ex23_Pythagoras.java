package ch04;

/**
 * 피타고라스
 * a + b + c = 1000, a < b < c 를 만족하는 a, b, c 찾기 
 */


public class Ex23_Pythagoras {

	public static void main(String[] args) {
		for (int a = 1; a <= 333; a++) {
			for (int b= a + 1; b <= 499; b++) {
				int c = 1000 - (a + b);
				if(c*c == a*a + b*b) {
					System.out.println("a : " + a + ", b : " + b + ", c : " + c);
					break;
				}
			}
		}
	}

}
