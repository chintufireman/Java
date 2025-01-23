package predicates;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	public static void main(String[] args) {
		BinaryOperator<String> binaryOperator = (s1, s2) -> s1 + s2;
		System.out.println(binaryOperator.apply("Hello", "World"));
		//it takes two parameters of same type producing result of same type as
		//operands
	}
}
