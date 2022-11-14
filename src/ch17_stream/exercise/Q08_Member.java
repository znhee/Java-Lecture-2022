package ch17_stream.exercise;

public class Q08_Member {

	private String name;
	private String job;
	
	public Q08_Member(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	
	@Override
	public String toString() {
		return "Q08_Member [name=" + name + ", job=" + job + "]";
	}
	

}
