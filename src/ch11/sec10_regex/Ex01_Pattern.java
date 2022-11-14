package ch11.sec10_regex;

import java.util.regex.Pattern;

public class Ex01_Pattern {

	public static void main(String[] args) {
		String regExp = "010-\\d{3,4}-\\d{4}";
		String data1 = "010-2345-6789";
		String data2 = "010-234-9876";
		boolean result1 = Pattern.matches(regExp, data1);
		boolean result2 = Pattern.matches(regExp, data2);
		System.out.println(result1 + ", " + result2);
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data1 = "ckiekim@naver.com";
		data2 = "ck.kim@naver.com";
		result1 = Pattern.matches(regExp, data1);
		result2 = Pattern.matches(regExp, data2);
		System.out.println(result1 + ", " + result2);
		
				
	}

}
