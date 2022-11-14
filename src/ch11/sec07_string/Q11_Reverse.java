package ch11.sec07_string;

import java.util.Arrays;

public class Q11_Reverse {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "안녕하세요";
		
		System.out.println(reverse(str1));
		System.out.println(reverse(str2));
		
		System.out.println(isPalindrome("우영우"));
	}
	
	// reverse 해도 똑같은 단어들
	static boolean isPalindrome(String src) {
		
		return src.equals(reverse(src));
	}
	
	static String reverse(String src) {
		String reverseStr = "";
		int len = src.length();
		for (int i=1; i<=len; i++)
			reverseStr += src.charAt(len - i);		
		return reverseStr;
	}
}
