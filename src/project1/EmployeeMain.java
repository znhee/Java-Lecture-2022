package project1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


public class EmployeeMain {
	public static void main(String[] args) {
		Set<Employee> hs = new HashSet<>();
		hs.add(new Employee(133, "강자바", "부장", LocalDate.of(2000, 8, 1)));
		hs.add(new Employee(143, "은전기", "차장", LocalDate.of(2003, 1, 1)));
		hs.add(new Employee(163, "노전자", "과장", LocalDate.of(2018, 8, 1)));
		hs.add(new Employee(173, "권표준", "대리", LocalDate.of(2022, 1, 1)));
		hs.add(new Employee(213, "홍정부", "사원", LocalDate.of(2019, 1, 1)));
		
		for (Employee emp: hs)
			System.out.println(emp);
		System.out.println();
		
		hs.add(new Employee(123, "강자바", "부장", LocalDate.of(1998, 1, 1)));
		hs.add(new Employee(163, "노전자", "사원", LocalDate.of(2008, 8, 1)));
		
		for (Employee emp: hs)
			System.out.println(emp);
	}

}
