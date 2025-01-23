import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

	static List<String> words = Arrays.asList("apple", "jablebi", " mango", "orange", "hello world", "something");
	static List<person> persons  = Arrays.asList(new person(22,"anil"), new person(24, "ram")
			, new person(93, "snehi"));
	
	static List<Integer> nums = Arrays.asList(1,343,434,4311,56,657,1899,908,1000);
	
	public static void main(String[] args) {
		Function<String, String> f = t -> t;
		Optional<String> longest = words.stream().map(f).max(Comparator.comparing(t->t.toString().length()));
		System.out.println(longest.get());
		
		OptionalDouble avg=persons.stream().mapToInt(person::getAge).average();
		System.out.println(avg.getAsDouble());
		
		Map<Object, List<Integer>> odd =nums.stream().collect(Collectors.groupingBy(x->x%2==0));
	System.out.println(odd.toString());
	}
}
class person{
	int age;
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
	String name;
	person(int a,String n){
		age=a;
		name=n;
	}
}