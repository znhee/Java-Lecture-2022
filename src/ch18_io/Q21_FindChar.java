package ch18_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Q21_FindChar {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("찾을 문자열> ");
		String str = scan.nextLine();
		System.out.print("찾을 파일 > ");
		String path = scan.nextLine();
		
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		int lineNo = 1;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			else if(line.toLowerCase().indexOf(str) >= 0)
				System.out.println(lineNo + ":\t" + line);
			lineNo++;
		}
		br.close();
		
	}

}
