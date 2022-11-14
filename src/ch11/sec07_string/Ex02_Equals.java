package ch11.sec07_string;

public class Ex02_Equals {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = new String("홍길동");
		
		if (str1 == str2)		// 참조하는 주소가 같으냐
			System.out.println("같은 스트링 객체를 참조");
		else
			System.out.println("다른 스트링 객체를 참조");
		
		if (str1.equals(str2))		// 문자열에서는 이 방법을 사용해야함 
			System.out.println("문자열이 같음");
		else
			System.out.println("문자열이 다름");
	}
}
