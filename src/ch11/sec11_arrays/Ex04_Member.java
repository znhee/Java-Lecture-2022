package ch11.sec11_arrays;

public class Ex04_Member implements Comparable<Ex04_Member>{	
	int id;
	String name;
	
	Ex04_Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ex04_Member [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Ex04_Member o) {
		return name.compareTo(o.name);
	}}
