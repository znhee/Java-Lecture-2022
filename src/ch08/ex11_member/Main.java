package ch08.ex11_member;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MemberService memberService = new ArrayMemberService();
		memberService.register("kim", "98765", "김자바");
		memberService.register("hong", "12345", "홍길동");
		memberService.register("park", "11111", "박자바 ");
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
