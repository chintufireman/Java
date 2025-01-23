package predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = s -> System.out.println(s);
		//just accepts the data and returns it
		consumer.accept("hello"); 
		
		Consumer<List<Integer>> listConsumer1  =  li -> {
			for (Integer x : li) {
				System.out.println(x+100);
			}
		};
		Consumer<List<Integer>> listConsumer2  =  li -> {
			for (Integer x : li) {
				System.out.print(x+" ");
			}
		};
		listConsumer2.andThen(listConsumer1).accept(Arrays.asList(23,3,4,4,2));
	}
}
