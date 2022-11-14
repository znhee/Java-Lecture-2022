package ch11.sec03_object;

public class Ex03_CloneMain {

	public static void main(String[] args) {
		Customer original = new Customer("hong", "홍길동", 25, true);
		
		Customer cloned = original.getCustomer();
		cloned.age = 30;
		cloned.name = "김자바";
		
		System.out.println(original);
		System.out.println(cloned);
	}

}
