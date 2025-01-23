package interview.coding.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoObjectCompare {

	public static void main(String[] args) {
		Emp e = new Emp(23, "Rajat");
		Emp e2 = new Emp(25, "Harsh");
		Emp e3 = new Emp(23, "Rajat");
		System.out.println(e.equals(e2));
		List<Emp> emp = new ArrayList<Emp>();
		emp.add(e3);
		emp.add(e2);
		emp.add(e);
		Map<Integer, Set<Emp>> groupedByName = emp.stream()
				.collect(Collectors.groupingBy(Emp::getAge, Collectors.toSet()));
		System.out.println(groupedByName.entrySet().toString());
	}
}

class Emp {
	int age;
	String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Emp(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public boolean equals(Object emp) {
		if (this == emp)
			return true;
		if (emp == null)
			return false;
		if (getClass() != emp.getClass())
			return false;
		Emp myClass = (Emp) emp;
		
		return !myClass.getName().equals(name);
	}
}