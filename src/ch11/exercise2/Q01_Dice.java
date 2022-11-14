package ch11.exercise2;

/**
  1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게 임이 있다.
  (주사위의 눈은 Random 값을 이용한다.)
1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
3. 모두 다른 눈이 나오는 경우에는 (그중가장큰눈)×100원의 상금을 받게 된다.
- 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
  또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000으로 계산되어 12,000원을 받게 된다. 
  3개의 눈 이 6, 2, 5로 주어지면 그 중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
*/

import java.util.Random;

public class Q01_Dice {

	public static void main(String[] args) {
		Random random = new Random();
		int num1 = random.nextInt(6) + 1;
		int num2 = random.nextInt(6) + 1;
		int num3 = random.nextInt(6) + 1;
		int prize = getPrize(num1, num2, num3);
		System.out.println("주사위 눈 : " + num1 + ", " + num2 + ", " + num3);
		System.out.printf("tkdrma : %, d%n", prize);
	}
	
	private static int getPrize(int num1, int num2, int num3) {
		if (num1 == num2 && num1 == num3)
			return 10000 + num1 * 1000;
		else if (num1 == num2) {
			return 1000 + 100 * num1;
		}
		else if (num1 == num3) {
			return 1000 + 100 * num1;
		}
		else if (num2 == num3) {
			return 1000 + 100 * num2;
		}
		else {
			int max = (num1 > num2) ? num1 : num2;
			max = (num3 > max) ? num3 : max;
			return 100 * max;
		}
	}
}
