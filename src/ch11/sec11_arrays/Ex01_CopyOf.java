package ch11.sec11_arrays;

import java.util.Arrays;

public class Ex01_CopyOf {

	public static void main(String[] args) {
		char[] src = {'J', 'A', 'V', 'A'};
		
		// 방법 1 
		char[] dst = Arrays.copyOf(src, src.length);
		System.out.println(Arrays.toString(dst));			// [J, A, V, A]
		
		// 방법 2
		dst = Arrays.copyOfRange(dst, 1, 3);
		System.out.println(Arrays.toString(dst));			// [A, V]
		
		// 방법 3, 받는 배열의 기억장소가 확보되어야 함.
		char[] newDst = new char[4];
		System.arraycopy(src, 0, newDst, 0, src.length);
		System.out.println(Arrays.toString(newDst));		// [J, A, V, A]
		
		src[0] = 'j';
		src[1] = 'a';
		System.out.println(Arrays.toString(src));			// [j, a, V, A]
		System.out.println(Arrays.toString(newDst));		// [j, a, V, A]
	}

}
