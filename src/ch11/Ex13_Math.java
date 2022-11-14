package ch11;

public class Ex13_Math {

	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.abs(-5));
		System.out.println(Math.abs(-5.3));
		
		System.out.println(Math.ceil(1.7));			// 올림
		System.out.println(Math.ceil(-1.3));
		System.out.println(Math.floor(1.7));		// 내림
		System.out.println(Math.floor(-1.3));
		System.out.println(Math.max(1.3, 5.4));
		System.out.println(Math.min(2, 5));
		
		System.out.println(Math.random());
		System.out.println(Math.rint(2.3));			// 가까운 정수값을 실수값으로 알려줌
		System.out.println(Math.round(3.6));		// 반올림
	}

}
