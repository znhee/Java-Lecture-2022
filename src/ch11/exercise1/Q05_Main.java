package ch11.exercise1;

import java.util.HashSet;

public class Q05_Main {

	public static void main(String[] args) {
		// Student를 저장하는 HashSet 생성
		HashSet<Q05_Student> hashSet = new HashSet<Q05_Student>();
		
		// Student 저장
		hashSet.add(new Q05_Student("1"));
		hashSet.add(new Q05_Student("1"));		// 같은 학번이므로 중복 저장이 안됨
		hashSet.add(new Q05_Student("2"));
		hashSet.add(new Q05_Student("3"));
		
		// 저장된 Student 수 출력
		System.out.println("저장된 Student 수: " + hashSet.size());
	}

}
