package ch11.sec07_string;

public class Ex08_Trim {

	public static void main(String[] args) {
		String oldStr = "   자바 프로그래밍   \t \r";
		String newStr = oldStr.trim();
		
		System.out.println(newStr);					// 자바 프로그래밍
		System.out.println(newStr.length());		// 8
	}
}
