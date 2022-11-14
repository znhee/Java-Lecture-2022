package ch11.exercise1;

public class Q06_Member {
	private String id;
	private String name;
	
	public Q06_Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id +": " + name;
	}
		
	
}
