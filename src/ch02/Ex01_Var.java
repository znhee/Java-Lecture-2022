package ch02;

public class Ex01_Var {

	public static void main(String[] args) {
		int score = 90;
		int result = score * 2;
		
		/* Literal */
		int intLiteral = 30;	// integer
		int octal = 036;		// 8진수(octal)	
		int hexa = 0x1e;		// 16진수(hexadecimal)
		System.out.printf("%d, %d, %d\n", intLiteral, octal, hexa);
		double doubleLiteral = 3.14159;
		char charLiteral = 'a';
		String strLiteral = "A quick brown fox";
		boolean boolLiteral = true;
		
		if (result > 100) {
			int score1 = 30;
			System.out.println(score1);
		}
//		System.out.println(score);
	}

}
