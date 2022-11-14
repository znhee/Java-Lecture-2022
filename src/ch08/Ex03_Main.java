package ch08;

public class Ex03_Main {

	public static void main(String[] args) {
		Ex03_SmartTV smartTv = new Ex03_SmartTV();
		smartTv.turnOn();
		smartTv.search("Naver");
		smartTv.setVolume(4);
		smartTv.turnOff();
		
		Ex01_RemoteControllable rc = new Ex03_SmartTV();
		rc.turnOn();
		rc.setVolume(3);
		rc.turnOff();
		
		Ex03_Searchable sc = new Ex03_SmartTV();
		sc.search("Google");
	}

}
