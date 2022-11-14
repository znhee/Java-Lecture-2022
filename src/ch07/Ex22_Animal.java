package ch07;

public abstract class Ex22_Animal {
	String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}

class Cow extends Ex22_Animal {
	Cow() {
		this.kind = "소";
	}
	
	@Override
	public void sound() {
		System.out.println("음메");
	}
}

class Tiger extends Ex22_Animal {
	Tiger() {
		this.kind = "호랑이";
	}
	
	@Override
	public void sound() {
		System.out.println("어흥");
	}
}
// 추상 메소드를 재정의 하지 않으면 추상 클래스가 됨
abstract class Bird extends Ex22_Animal {
	Bird() {
		this.kind = "조류";
	}
}