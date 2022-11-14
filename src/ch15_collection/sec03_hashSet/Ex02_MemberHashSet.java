package ch15_collection.sec03_hashSet;

import java.util.HashSet;
import java.util.Set;

public class Ex02_MemberHashSet {

	public static void main(String[] args) {
		Member member1 = new Member("홍길동", 30);
		Member member2 = new Member("홍길동", 30);
		System.out.println(member1.hashCode() + ", " + member2.hashCode());
		System.out.println(member1.equals(member2));
		
		Set<Member> set = new HashSet<>();
		set.add(member1);
		set.add(member2);			// 중복 객체(hashCode()와 equals())
		set.add(new Member("홍길동", 28));
		
		// 저장된 객체수
		System.out.println("저장된 객체 수 : " + set.size());
	}
	
}
