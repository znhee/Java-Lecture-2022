package ch06.exercise;

public class Q20_Account {
	private String name;
	private String ano;
	private int balance;
	
	public Q20_Account(String ano, String name, int balance) {
		super();
		this.name = name;
		this.ano = ano;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
