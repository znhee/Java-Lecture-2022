package ch17_stream;

public class Ex10_Student implements Comparable<Ex10_Student> {
	private String name;
	private int score;
	
	public Ex10_Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return "Ex10_Student [name=" + name + ", score=" + score + "]";
	}
	
	@Override
	public int compareTo(Ex10_Student o) {
		return score - o.getScore();		// Integer.compareTo(score, o.getScore())
	}
	
	
	
}
