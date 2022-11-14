package ch11.exercise1;

import java.util.Objects;

public class Q05_Student {
	private String studentNum;

	public Q05_Student(String studentNum) {
		super();
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(studentNum);
//		return Objects.hash(studentNum);
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (!(obj instanceof(studentNum)))
//			return Objects.equals(studentNum, other.studentNum);
//	}
	
	
	
}
