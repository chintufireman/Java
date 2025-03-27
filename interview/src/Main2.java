import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class Main2 {

	public static void main(String[] args) {
		List<Emp> list = Arrays.asList(new Emp(1, "Alice", "IT", 70000, LocalDate.of(2018, 3, 15)),
				new Emp(2, "Bob", "HR", 45000, LocalDate.of(2019, 7, 10)),
				new Emp(3, "Charlie", "IT", 60000, LocalDate.of(2016, 11, 5)),
				new Emp(4, "David", "Finance", 52000, LocalDate.of(2021, 1, 20)),
				new Emp(5, "Eva", "IT", 80000, LocalDate.of(2015, 4, 25)),
				new Emp(6, "Frank", "Finance", 47000, LocalDate.of(2019, 9, 30)),
				new Emp(7, "Grace", "HR", 75000, LocalDate.of(2017, 2, 14)));
				new Emp(8, "Chutia", "HR", 75000, LocalDate.of(2022, 2, 14));

		//1. Filter Emps who joined before 2020 and have a salary greater than 50,000
//				Filtering with complex conditions
//		list.stream()
//		.filter(e -> e.getSalary() > 50000 
//				&& e.getJoiningDt().isBefore(LocalDate.of(2020, 1, 1)))
//		.collect(Collectors.toList())
//		.forEach(System.out::println);
		
//		2. Group these employees by their department and calculate the average salary in 
//		each department.
//				Grouping and calculating averages
//		ToDoubleFunction<Emp> toDoubleFunction = (e) -> e.getSalary();
//		
//		list
//		.stream()
//		.collect(Collectors.groupingBy(e->e.getDept(),
//				Collectors.averagingDouble(toDoubleFunction)))
//		.entrySet()
//		.stream()
//		.forEach(System.out::println);
		
		
//		Find the top 3 highest-paid employees sorted by salary in descending order.
//				concept -> Sorting and limiting results
//		list.stream()
//		.map(e->e.getSalary())
//		.sorted(Comparator.reverseOrder())
//		.limit(3)
//		.forEach(System.out::println);
		
//		Create a Map<String, List<Employee>> where the key 
//		is "Senior" for employees with 5+ years of experience and "Junior" for others.
//		concept -> Conditional mapping (e.g., "Senior" vs "Junior")

//			Function<Emp, String> function = (e) -> e.getJoiningDt()
//					.isBefore(LocalDate.now().minusYears(5)) ? "Senior" :"Junior";
//				
//		list.stream()
//		.collect(Collectors.groupingBy(function,Collectors.toList()))
//		.entrySet()
//		.stream()
//		.forEach(System.out::println);
		
//		Display employees' names who have the second-highest salary in each department
//		concept -> Finding the second-highest element in groups
				
//		list.stream()
//		.collect(Collectors.groupingBy(e->e.getDept(), Collectors.toList()))
//		.entrySet()
//		.stream()
//		.map(e -> e.getValue()
//				.stream()
//				.map(e1->e1.getSalary())
//				.sorted(Collections.reverseOrder())
//				.skip(1)
//				.limit(1)
//				.findFirst())
//		.collect(Collectors.toList())
//		.stream()
//		.forEach(e->System.out.println(e.get()));;
		
	}
}

class Emp {
	int id;
	String name;
	String dept;
	double salary;
	LocalDate joiningDt;

	public Emp(int id, String name, String dept, double salary, LocalDate joiningDt) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.joiningDt = joiningDt;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", joiningDt=" + joiningDt
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getJoiningDt() {
		return joiningDt;
	}

	public void setJoiningDt(LocalDate joiningDt) {
		this.joiningDt = joiningDt;
	}
}