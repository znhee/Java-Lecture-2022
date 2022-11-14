package ch13_generic.sec04_method;

public class MainBox {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(null);
		int intValue = box1.get();
		System.out.println(intValue);

		Box<String> box2 = Util.boxing("홍길동"); // 컴파일러가 <String> 추정
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
