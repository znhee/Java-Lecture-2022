package ch06;

import java.util.Scanner;

public class Ex41_Exercise15 {

	public static void main(String[] args) {
		Ex41_MemberService memberService = new Ex41_MemberService();
		memberService.register("kim", "98765", "김자바");
		memberService.register("hong", "12345", "홍길동");
		memberService.register("hong", "11111", "홍자바 ");
		memberService.printAllMembers();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디(Id): ");
		String id = scan.nextLine();
		System.out.print("패스워드(Password): ");
		String password = scan.nextLine();
		boolean result = memberService.login(id, password);
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout(id);
		}
		else
			System.out.println("Id 또는 Password가 올바르지 않습니다.");
			
	}
}
