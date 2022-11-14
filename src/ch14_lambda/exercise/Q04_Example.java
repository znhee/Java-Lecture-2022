package ch14_lambda.exercise;

import ch14_lambda.Ex01_MyFunctionalInterface;

public class Q04_Example {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for (int i=0; i<=2; i++ )
				System.out.println("작업 스레드가 실행됩니다."); 
		});
		thread.start();
	}	
}
