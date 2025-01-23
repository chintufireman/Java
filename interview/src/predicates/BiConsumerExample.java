package predicates;

import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biconsumer = (x, y) -> System.out.println(x + y);

		biconsumer.accept(5, 10);

	}
}
