package interview.coding.stream;

import java.util.Objects;

public class Employee {
	
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
