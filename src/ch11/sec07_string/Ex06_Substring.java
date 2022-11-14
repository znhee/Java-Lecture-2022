package ch11.sec07_string;

public class Ex06_Substring {

	public static void main(String[] args) {
		String ssn = "990823-1234567";
		
		String firstPart = ssn.substring(0, 6);
		System.out.println(firstPart);
		
		String secondPart = ssn.substring(7);
		System.out.println(secondPart);
		
		// ssn에서 생년원일을 YYYY-MM-DD로 표시하기
		String yyyy = "19" + ssn.substring(0,2);
		String mm = ssn.substring(2,4);
		String dd = ssn.substring(4,6);
		
		System.out.println(yyyy + "-" + mm + "-" + dd);
	}

}
