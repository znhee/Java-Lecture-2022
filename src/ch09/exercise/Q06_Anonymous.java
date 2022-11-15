package ch09.exercise;

public class Q06_Anonymous {
	Q06_Vehicle field = new Q06_Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	
	void method1() {
		Q06_Vehicle localVar = new Q06_Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다");
			}
		};
		localVar.run();
	}
	
	void method2(Q06_Vehicle v) {
		v.run();
	}
}
