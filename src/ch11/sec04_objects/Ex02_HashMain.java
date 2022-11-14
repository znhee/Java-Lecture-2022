package ch11.sec04_objects;

public class Ex02_HashMain {

	public static void main(String[] args) {
		Student s1 = new Student(1, "박자바");
		Student s2 = new Student(2, "홍자바");
		Student s3 = new Student(3, "이자바");
		Student s4 = new Student(2, "김자바");
		
		// objects에 sno만 준 경우 -> s2, s4의 hash code가 같음
		System.out.println(s1.hashCode() + ", " + s2.hashCode());		
		System.out.println(s3.hashCode() + ", " + s4.hashCode());		
		
		
	}

}
