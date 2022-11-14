package ch07;

public class Ex22_Main {

	public static void main(String[] args) {
		Cow cow = new Cow();
		Tiger tiger = new Tiger();
		cow.sound();
		tiger.sound();
		System.out.println();
		
		// 자동 타입 변환
//		Ex22_Animal animal = new Ex22_Animal();		
		Ex22_Animal animal = null;
		animal = new Cow();
		animal.sound();
		animal = new Tiger();
		animal.sound();
		System.out.println();
		
		// 매개변수의 자동 타입 변환
		animalSound(new Cow());
		animalSound(new Tiger());
	}
		
	static void animalSound(Ex22_Animal animal) {
		animal.sound();
	}
}
