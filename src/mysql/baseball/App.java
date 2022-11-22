package mysql.baseball;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import mysql.customer.Customer;

public class App {

	private static Scanner scan = new Scanner(System.in);
	private static DAO dao = new DAO();
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1. 선수목록 | 2. 선수등록 | 3. 정보수정 | 4. 선수방출 | 5. 종료");
			System.out.println("-----------------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
				listPlayers(); break;
			case 2:
				registerPlayer(); break;
			case 3:
				updatePlayer(); break;
			case 4:
				deletePlayer(); break;
			case 5:
				run = false; break;
			default:
				System.out.println("Warning: 1에서 5까지의 숫자만 입력하세요.");
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	public static void listPlayers() {
		System.out.println("--------------");
		System.out.println("선수 목록");
		System.out.println("--------------");
		List<Player> list = dao.getPlayers();
		for (Player p: list)
			System.out.println(p);
	}
	
	public static void registerPlayer() {
		System.out.println("--------------");
		System.out.println("선수 등록");
		System.out.println("--------------");
		int backNum = 0;
		while (true) {
			System.out.print("Back Number > ");
			backNum = Integer.parseInt(scan.nextLine());
			Player p = dao.getPlayer(backNum);
			if (p.getName() == null)
				break;
			System.out.println("중복된 Back Number 입니다. 다시 입력하세요");
		}
		System.out.print("이름 > ");
		String name = scan.nextLine();
		System.out.print("포지션 > ");
		String position = scan.nextLine();
		System.out.print("생일 > ");
		String birthday = scan.nextLine();
		System.out.print("키 > ");
		int height = Integer.parseInt(scan.nextLine());
		
		Player np = new Player (backNum, name, position, LocalDate.parse(birthday), height, 0);
		dao.insertPlayer(np);
		System.out.println("선수 등록이 완료되었습니다.");
	}
	
	public static void updatePlayer() {
		System.out.println("--------------");
		System.out.println("정보 수정");
		System.out.println("--------------");
		System.out.print("Back Number > ");
		int backNum = Integer.parseInt(scan.nextLine());
		Player p = dao.getPlayer(backNum);
		
		System.out.print("이름(" + p.getName() + ")> ");
		String name = scan.nextLine();
		System.out.print("포지션(" + p.getPosition() + ")> ");
		String position = scan.nextLine();
		System.out.print("생일(" + p.getBirthday().toString() + ")> ");
		String birthday = scan.nextLine();
		System.out.print("키(" + p.getHeight() + ")> ");
		int height = Integer.parseInt(scan.nextLine());
		
		p = new Player(backNum, name, position, LocalDate.parse(birthday), height, 0);
		dao.updatePlayer(p);
		System.out.println("선수 정보 수정이 완료되었습니다.");

	}
	
	public static void deletePlayer() {
		System.out.println("--------------");
		System.out.println("선수 방출");
		System.out.println("--------------");
		
		System.out.print("Back Number > ");
		int backNum = Integer.parseInt(scan.nextLine());
		dao.deletePlayer(backNum);
		System.out.println("선수 방출이 완료되었습니다.");
	}
}
