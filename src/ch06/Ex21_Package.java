package ch06;

import java.time.LocalDate;

import ch04.Ex24_Diamond;

public class Ex21_Package {

	public static void main(String[] args) {
		LocalDate a = LocalDate.now();
		Ex17_MyArray myArray = new Ex17_MyArray(4);						// ch06 package 
		ch05.Ex15_ArrayCopy arrayCopy = new ch05.Ex15_ArrayCopy();		// ch05 package
		Ex24_Diamond diamond = new Ex24_Diamond();						// ch04 package import해야 에러 X 
	}
}
