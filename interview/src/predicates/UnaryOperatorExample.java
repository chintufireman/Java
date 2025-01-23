package predicates;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	public static void main(String[] args) {
		// if you want a function which takes one parameter and returns the same type as
		// input parameter then use UnaryOperator
		UnaryOperator<Integer> unaryOperator = x -> x * x;
		System.out.println(unaryOperator.apply(5));
	}
}
