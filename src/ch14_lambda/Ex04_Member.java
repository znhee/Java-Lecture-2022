package ch14_lambda;

public class Ex04_Member {
	int id;
	String name;
	
	public Ex04_Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Ex05_Member [id=" + id + ", name=" + name + "]";
	}
}
