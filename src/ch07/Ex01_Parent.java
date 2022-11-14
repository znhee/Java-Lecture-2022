package ch07;

public class Ex01_Parent {
	int parentInt;
	
	Ex01_Parent() {}
	
	public Ex01_Parent(int parentInt) {
		super();
		this.parentInt = parentInt;
	}

	void parentMethod() {
		System.out.println(parentInt);
	}
	
	
}
