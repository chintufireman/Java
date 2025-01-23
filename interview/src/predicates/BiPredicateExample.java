package predicates;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		
		//when u want two parameters in predicates then use this functional interface
		BiPredicate<Integer, Integer> bipredicate = (x, y) -> x % 2 == 0 && y % 2 == 0;
		System.out.println(bipredicate.test(10, 443));

	}
}
