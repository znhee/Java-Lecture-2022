package exercise.ch11;

import java.io.IOException;

public class Q08_FileWriterExample {

	public static void main(String[] args) {
		
		try {
			Q08_FileWriter fw = new Q08_FileWriter("file.txt");
			fw.write("Java");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
