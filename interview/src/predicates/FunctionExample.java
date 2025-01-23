package predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionExample {

	public static void main(String[] args) {
		Function<String, Integer> function = x -> x.length();
		Function<String, String> func2 = x -> x.substring(0, 3);
		Function<List<Student>, List<Student>> studentsWithVipAsPrefix = li -> {
			List<Student> result = new ArrayList<Student>();
			for (Student s : li) {
				if (func2.apply(s.getName()).equalsIgnoreCase("vip")) {
					result.add(s);
				}
			}
			return result;

		};
		List<Student> students = Arrays.asList(new Student("vipul", 22), new Student("vipin", 34),
				new Student("vibhuti", 59));

		System.out.println(function.apply("harsh"));
		System.out.println(studentsWithVipAsPrefix.apply(students));

		// function chaining
		Function<Integer, Integer> f1 = x -> 2 * x;
		Function<Integer, Integer> f2 = x -> x * x * x;

		System.out.println(f1.andThen(f2).apply(3));// 216
		System.out.println(f2.andThen(f1).apply(3));// 54

		System.out.println(f1.compose(f2).apply(3));// 54 reverse of f1.andThen(f2).apply(3)

		// Identity method
		Function<String, String> identityFunction = Function.identity();
		System.out.println(identityFunction.apply("vipul"));
		// whatever input u provide is outputed as same only

	}
}
