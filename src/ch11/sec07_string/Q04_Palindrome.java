package ch11.sec07_string;

public class Q04_Palindrome {

	public static void main(String[] args) {
		int max = 0;
		for (int i=100; i<=999; i++) {
			for (int j=i; j<=999; j++)
			{
				int mul = i * j;
				if (Strings.isPalindrome(String.valueOf(mul)) && mul > max)
					max = mul;
			}
		}
		System.out.println(String.valueOf(max));
	}

}
