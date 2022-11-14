package ch11.sec03_object;

/**
 * Equals : 두 객체가 참조하는 주소가 같으냐를 비교
 */

public class Ex01_EqualsMain {

	public static void main(String[] args) {
		Member member1 = new Member("hong", "홍길동");
		Member member2 = new Member("hong", "홍자바");
		Member member3 = new Member("hong", "홍길동");	
		
		// Member에서 equals method를 재정의하기 이전
		System.out.println(member1.equals(member3));		// false
		System.out.println(member1 == member3);				// false
		
		// Member class에서 id만 같으면 true라고 한 경우
		System.out.println(member1.equals(member3));		// true
		System.out.println(member1.equals(member2));		// true
		
		// Member class에서 id와 name 둘 다 같으면 true라고 한 경우
		System.out.println(member1.equals(member3));		// true
		System.out.println(member1.equals(member2));		// false
	}

}
