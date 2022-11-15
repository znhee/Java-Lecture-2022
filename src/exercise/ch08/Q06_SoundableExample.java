package exercise.ch08;

public class Q06_SoundableExample {

	public static void printSound(Q06_Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Q06_Cat());
		printSound(new Q06_Dog());
	}


}
