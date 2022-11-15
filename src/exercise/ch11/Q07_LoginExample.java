package exercise.ch11;

public class Q07_LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws Q07_NotExistIDException, Q07_WrongPasswordException {
		if(!id.equals("blue")) {
			throw new Q07_NotExistIDException("아이디가 존재하지 않습니다.");
		}
		if(!password.equals("12345")) {
			throw new Q07_WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}
