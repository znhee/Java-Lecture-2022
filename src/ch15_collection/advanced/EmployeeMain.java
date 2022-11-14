package ch15_collection.advanced;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeMain {
	public static void main(String[] args) {
		Set<Employee> ts = new TreeSet<>();
		// 직급, 입사날짜 별로 정렬
		ts.add(new Employee(123, "김자바", Position.부장, LocalDate.of(1998, 1, 1)));
        ts.add(new Employee(133, "강자바", Position.부장, LocalDate.of(2000, 8, 1)));
        ts.add(new Employee(143, "은전자", Position.차장, LocalDate.of(2003, 1, 1)));
        ts.add(new Employee(163, "이마이", Position.차장, LocalDate.of(2009, 10, 1)));
        ts.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2008, 1, 1)));
        ts.add(new Employee(203, "노전자", Position.과장, LocalDate.of(2018, 8, 11)));
        ts.add(new Employee(173, "권표준", Position.대리, LocalDate.of(2022, 1, 1)));
        ts.add(new Employee(193, "유표준", Position.대리, LocalDate.of(2017, 4, 1)));
        ts.add(new Employee(183, "천디비", Position.사원, LocalDate.of(2016, 1, 1)));
        ts.add(new Employee(213, "홍정부", Position.사원, LocalDate.of(2019, 1, 1)));
        
        // compareTo로 0면 같은 객체다.
        ts.add(new Employee(513, "한정부", Position.사원, LocalDate.of(2019, 1, 1)));
        ts.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2010, 1, 1)));
        
        for (Employee emp : ts)
        	System.out.println(emp);
        System.out.println();
        
        Set<Employee> hs = new HashSet<>();
        // 기준 X
        hs.add(new Employee(123, "김자바", Position.부장, LocalDate.of(1998, 1, 1)));
        hs.add(new Employee(133, "강자바", Position.부장, LocalDate.of(2000, 8, 1)));
        hs.add(new Employee(143, "은전자", Position.차장, LocalDate.of(2003, 1, 1)));
        hs.add(new Employee(163, "이마이", Position.차장, LocalDate.of(2009, 10, 1)));
        hs.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2008, 1, 1)));
        hs.add(new Employee(203, "노전자", Position.과장, LocalDate.of(2018, 8, 11)));
        hs.add(new Employee(173, "권표준", Position.대리, LocalDate.of(2022, 1, 1)));
        hs.add(new Employee(193, "유표준", Position.대리, LocalDate.of(2017, 4, 1)));
        hs.add(new Employee(183, "천디비", Position.사원, LocalDate.of(2016, 1, 1)));
        hs.add(new Employee(213, "홍정부", Position.사원, LocalDate.of(2019, 1, 1)));
        
        // hash code, equals로 같은 객체인지 정의.
        hs.add(new Employee(513, "한정부", Position.사원, LocalDate.of(2019, 1, 1)));
        hs.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2010, 1, 1)));
        
        for (Employee emp : hs)
        	System.out.println(emp);
        System.out.println();
        
        // Stream을 이용하면 순서도 조정 가능(입사일자 기준)
        hs.stream()
          .sorted((o1, o2) -> o1.getJoinDate().compareTo(o2.getJoinDate()))
          .forEach(s -> System.out.println(s));
	}
}
