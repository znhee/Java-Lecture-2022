package ch15_collection.advanced;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable{
	private int id;
	private String name;
	
	private Position position;
	private LocalDate joinDate;
	
	Employee(int id, String name, Position position, LocalDate joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.joinDate = joinDate;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Position getPosition() {
		return position;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", joinDate=" + joinDate + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee))
			return false;
		Employee e = (Employee) obj;
		return id == e.getId() && name.equals(e.getName());
	}
	
	@Override
	public int compareTo(Object o) {
		if (!(o instanceof Employee))
			return 0;
		Employee e = (Employee) o;
		return position.equals(e.getPosition()) ?
				joinDate.compareTo(e.getJoinDate()) :
				position.compareTo(e.getPosition());
	}

}
