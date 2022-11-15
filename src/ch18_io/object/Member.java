package ch18_io.object;

import java.io.Serializable;

public class Member implements Serializable {
	/** 
	 * serialVersionUID 값은 프로그램 작성자가 버전 관리 해야함
	 */
	private static final long serialVersionUID = -8256351408319506718L;
	private String id;
	private String name;
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
}	
