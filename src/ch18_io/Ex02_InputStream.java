package ch18_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Ex02_InputStream {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("/tmp/test.db");
			
			// 방법 1
//			while(true) {
//				int data = is.read();
//				if (data == -1)
//					break;
//				System.out.println(data);
//			}
			
			// 방법 2
			byte[] arr = new byte[100];
			while (true) {
				int num = is.read(arr);
				if (num == -1)
					break;
			}
			System.out.println(Arrays.toString(arr));
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
