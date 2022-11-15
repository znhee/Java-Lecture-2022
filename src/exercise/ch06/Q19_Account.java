package exercise.ch06;

public class Q19_Account {
	private int balance;
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if (balance < Q19_Account.MIN_BALANCE || balance > Q19_Account.MAX_BALANCE) {
			return;
		}
		this.balance = balance;
	}
	
}
