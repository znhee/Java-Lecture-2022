package ch11.sec07_string;

/** 숫자값 보지말고, 부호만 보기 */

public class Ex10_CompareTo {

	public static void main(String[] args) {
		String str1 = "Apple";
		String str2 = "Cherry";
		String str3 = "air";
		
		System.out.println(str1.compareTo(str2));	// -2: A - C
		System.out.println(str1.compareToIgnoreCase(str3));		// 7: apple - air -> p - i
		
		String han1 = "가나다";
		String han2 = "라마바";
		System.out.println(han1.compareTo(han2)); 	// -2940: 가 - 라
		
		System.out.println(str1.compareTo(han1)); 	// -43967: A - 가 -> 영어가 먼저다.
	}

}
