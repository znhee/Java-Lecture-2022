package ch11.sec07_string;

import java.util.Scanner;

public class Q05_CaesarCipher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문장 입력 > ");
		String plainText = scan.nextLine();
		System.out.print("step 입력 > ");
		int step = scan.nextInt();
		String cipherText = plain2cipher(plainText, step);
		System.out.println(cipherText);
		System.out.println(cipher2plain(cipherText, step));
	}
	
	// 암호화(Encoding)	
	static String plain2cipher(String text, int step) {
		char[] cipherText = new char[text.length()];
		for (int i=0; i<text.length(); i++) {
			char c = text.charAt(i);
			char d = (char)(c + step);
			if (c == ' ') {
				cipherText[i] = c;
				continue;
			}			
			if (d > 'Z')
				d = (char) (d - 26);
			cipherText[i] = d;
		}
		return new String(cipherText);
	}
	
	// 복호화(Decoding)
	static String cipher2plain(String text, int step) {
		char[] plainText = new char[text.length()];
		for (int i=0; i<text.length(); i++) {
			char c = text.charAt(i);
			char d = (char)(c - step);
			if (c == ' ') {
				plainText[i] = c;
				continue;
			}
			if (d < 'A')
				d = (char) (d + 26);
			plainText[i] = d;		
		}		
		return new String(plainText);
	}
}
