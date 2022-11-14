package ch06.exercise;

import java.util.Scanner;

public class Q20_BankApplication {
	private static Q20_Account[] accountArray = new Q20_Account[100];
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean a = true;
		while(a) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택 > ");
			int button = scan.nextInt();
			if (button == 1) {
				createAccount();
			}
			else if (button == 2) {
				AccountList();
			}
			else if(button == 3) {
				deposit();
			}
			else if (button == 4) {
				withdraw();
			}
			else if (button == 5) {
				System.out.println("프로그램 종료");
				a = false;
			}
		}
	}
	
	private static void createAccount() {
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String ano = scan.next();
		
		System.out.print("계좌주: ");
		String name = scan.next();
		
		System.out.print("초기입금액: ");
		int balance = scan.nextInt();
		
		Q20_Account newAccount = new Q20_Account(ano, name, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	private static void AccountList() {
		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");
		
		for (int i = 0; i < accountArray.length; i++) {
			Q20_Account account = accountArray[i];
			if (account != null) {
				System.out.print(account.getAno());
				System.out.print("      ");
				System.out.print(account.getName());
				System.out.print("      ");
				System.out.print(account.getBalance());
				System.out.print("      ");
				System.out.println();
			}
		}
		
	}
	
	private static void deposit( ) {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String ano = scan.next();
		
		System.out.print("예금액: ");
		int money = scan.nextInt();
		
		Q20_Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 예금이 성공되었습니다.");
		
	}
	
	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String ano = scan.next();
		
		System.out.print("출금액: ");
		int money = scan.nextInt();
		
		Q20_Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기 
	private static Q20_Account findAccount(String ano) {
		Q20_Account account = null;
			for(int i=0; i<accountArray.length; i++) {
					if(accountArray[i] != null) {
						String dbAno = accountArray[i].getAno(); 
						if(dbAno.equals(ano)) {
							account = accountArray[i];
							break; 
						}
					}	 
				}
		return account; 
		}
}
