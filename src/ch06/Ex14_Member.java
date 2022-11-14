package ch06;

public class Ex14_Member {
	private String uid;
	private String name;
	private String pwd;
	private int age;
	
	public Ex14_Member() {};
	public Ex14_Member(String uid, String name, String pwd, int age) {
		super();
		this.uid = uid;
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Ex14_Member [uid=" + uid + ", name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}
	
}
