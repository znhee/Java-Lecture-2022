package ch15_collection.exercise;

import java.util.Objects;

import ch15_collection.sec03_hashSet.Member;

public class Q08_Student {
	public int studentNum;
	public String name;
	
	public Q08_Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(studentNum);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Q08_Student))
			return false;
		Q08_Student target = (Q08_Student) obj;
			return studentNum == target.studentNum;
	}
}
