package ch06;

public class Ex31_Account {
	private int balance;
	
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	Ex31_Account () {}
	Ex31_Account(int balance) {
		super();
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {

		// 매개변수 balance가 0 이상 100만 이하 
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE)
			this.balance = balance;
	}
}