package predicates;

import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) {
		Predicate<Integer> salaryGreaterThan = x -> x>100000;
//		System.out.println(salaryGreaterThan.test(1000000));
		
		Predicate<String> startsWithLetterH = x -> x.toLowerCase().charAt(0) == 'h';
		Predicate<String> endWithLetterH = x->x.toLowerCase().charAt(x.length()-1)=='h';
		Predicate<String> andLogic = startsWithLetterH.and(endWithLetterH);
		
		System.out.println(andLogic.test("harshs"));
		
		Predicate<Integer> firstSalary = x -> x == 20000;
		Predicate<Integer> secondSalary = x -> x < 10000;
		Predicate<Integer> orLogic = firstSalary.or(secondSalary);
		
		System.out.println(orLogic.test(200000));
		
		Predicate<Object> predicate = Predicate.isEqual("Harsh");
		System.out.println(predicate.test("Harsh"));
	}
}
