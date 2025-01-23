package predicates;

import java.util.function.BiFunction;

public class BiFunctionExample {
	public static void main(String[] args) {
		BiFunction<String, String, Integer> bifunction = (x, y) -> x.length() + y.length();
		System.out.println(bifunction.apply("hi", "hello"));
	}
}
