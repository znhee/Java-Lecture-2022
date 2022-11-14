package ch11.sec10_regex;

import java.util.Arrays;

public class Ex02_ReplaceAll {

	public static void main(String[] args) {
		String data = "나는 Java Program이 좋아요!!!";
		System.out.println(data.replaceAll("[A-Z]", ""));			// 대문자 제거 
		System.out.println(data.replaceAll("[a-z]", ""));			// 소문자 제거
		System.out.println(data.replaceAll("[^가-힣 ]", ""));		// 한글, 공백만 남기고 제거
		
		data = System.getenv("JAVA_HOME");
		System.out.println(data);
		String[] arr = data.split("/");
		System.out.println(Arrays.toString(arr));
	}

}
