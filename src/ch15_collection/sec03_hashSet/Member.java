package ch15_collection.sec03_hashSet;

import java.util.Objects;

public class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(name, age);
//		return name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Member))
			return false;
		Member target = (Member) obj;
			return name.equals(target.name) && age == target.age;
			
//		if (obj instanceof Member target)
//			return name.equals(target.name) && age == target.age;
//		else
//			return false;
	}
}
