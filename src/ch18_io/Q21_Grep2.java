package ch18_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Grep 찾을 문자열(대소문자 구분 없음) 찾을 파일
 */

public class Q21_Grep2 {

	public static void main(String[] args) {
		grep("reader", "/tmp/Q21_Grep2.java");
	}
	
	public static void grep(String word, String filePath) {
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			int lineNo = 0;
			while(true) {
				String rowData = br.readLine();
				if (rowData == null)
					break;
				lineNo++;
				String lineData = rowData.toLowerCase();
				if (lineData.indexOf(word) >= 0)
					System.out.printf("%3d: \t%s%n", lineNo, rowData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
