package ch11;

import java.util.Arrays;
import java.util.Random;

public class Ex14_Random {

	public static void main(String[] args) {
//		Random random = new Random(2022);			// 2022: seed 값
		Random random = new Random();
		System.out.println(random.nextInt(100));
		
		System.out.println("Lotto");
		int[] lotto = new int[6];
		int index = 0;
		while (true) {
			int num = random.nextInt(45) + 1;
			if (!isValidNumber(num, lotto))
				continue;
			lotto[index++] = num;
			if (index == 6)
				break;
		}

		System.out.println(Arrays.toString(lotto));
	}
	
	static boolean isValidNumber(int num, int[] lotto) {
		for (int a : lotto) 
			if (num == a)
				return false;
		return true;
	}

}
