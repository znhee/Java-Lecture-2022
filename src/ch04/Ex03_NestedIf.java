package ch04;

/**
 * 중첩 IF 
 */
public class Ex03_NestedIf {

	public static void main(String[] args) {
		System.out.println("92점은 " + grade(92) + "학점 입니다.");
		System.out.println("86점은 " + grade(86) + "학점 입니다.");
		System.out.println("82점은 " + grade(82) + "학점 입니다.");
		System.out.println("77점은 " + grade(77) + "학점 입니다.");
	}


	private static String grade(int score) {
		String grade;
		if (score > 90) {
			if (score >= 97 && score <= 100)
				grade = "A+";
			else if (score >= 94)
				grade = "A0";
			else
				grade = "A-";
		}
		else if (score > 80) {
			if (score >= 87)
				grade = "B+";
			else if (score >= 84)
				grade = "B0";
			else
				grade = "B-";
		}
		else
			grade = "C";
		return grade;
	}
}