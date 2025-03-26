import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	static List<String> words = Arrays.asList("apple", "jablebi", " mango", "orange", "hello world", "something");
	static List<person> persons  = Arrays.asList(new person(22,"anil"), new person(24, "ram")
			, new person(93, "snehi"));
	
	static List<Integer> nums = Arrays.asList(1,343,434,4311,56,657,1899,908,1000);
	
	public static void main(String[] args) {
		Comparator<Integer> comparator = (o1, o2) -> o2-o1;
		  Optional<Integer> findFirst = nums.stream()
				  .sorted(Collections.reverseOrder())
				  .limit(5)
				  .skip(4)
				  .findFirst();
		  
		  System.out.println(findFirst.get());
		  
		  //words.stream().mapToLong(words->words.chars().filter(ch->ch=='i')).count()).sum();
		  
		  String country = "india";
//		  long count = country.chars().filter( x-> x == 'i').count();
		  IntStream chars = country.chars();
		  
		  String s ="hello";
		  //show me the appearance of chars in string using java 8
		  Map<Character, Long> collect = s
				  .chars()
				  .mapToObj(x->(char)x)
				  .filter(Character::isLetterOrDigit)
				  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		  System.out.println(collect.toString());
		  //remove duplicates from string
		  
//		  s.chars().mapToObj(x->(char)x).collect(Collectors.filtering(null, null));
		  //sum of 3 elements should be 0
		  
		  
		  //printing duplicates
		  int num[] = {1,2,2,2,9,9,7,8,5,5,0,3,4,6};
		 List<Integer> ls = Arrays.asList(Arrays.stream(num).map(e->e).boxed().toArray(Integer[]::new));
		 
		  IntStream of = IntStream.of(num);
		  	of
		  	.boxed()
		  	.collect(Collectors.groupingBy(e->e,Collectors.counting()))
		  	.entrySet()
		  	.stream()
		  	.filter(e->e.getValue() > 1)
		  	.forEach(e -> System.out.println(e.getKey()));
		  	
		  	
		  	
		  	//
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

