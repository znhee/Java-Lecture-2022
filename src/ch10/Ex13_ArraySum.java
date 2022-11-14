package ch10;

public class Ex13_ArraySum {

	public static void main(String[] args) {
		int[] arr = {5, 14, 43, 28, 76};
		int sum = 0, index = 0;
		
		try {
			while(true) {
				sum += arr[index++];
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(sum);
		}
	
	}

}
