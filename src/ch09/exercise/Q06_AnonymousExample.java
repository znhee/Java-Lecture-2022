package ch09.exercise;

public class Q06_AnonymousExample {

	public static void main(String[] args) {
		Q06_Anonymous anony = new Q06_Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(
			new Q06_Vehicle() {
				@Override
				public void run() {
					System.out.println("트럭이 달립니다");
				}
			}
		);
	}

}
