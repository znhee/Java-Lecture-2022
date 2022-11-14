package ch11.sec07_string;

public class Q01_DigitalClock {

	public static void main(String[] args) {
		int sec = 0;
		for (int hour=0; hour<=23; hour++) {
			for (int min=0; min<=59; min++) {
				String timeString = hour + ":" + min;
				if (timeString.indexOf("3") >= 0)
					sec += 60;
			}				
		}
		System.out.println("디지털 시계에 3이 표시되는 시간 : " + sec + "초");
	}

}
