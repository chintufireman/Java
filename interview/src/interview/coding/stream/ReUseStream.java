package interview.coding.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//can we reuse stream ?
public class ReUseStream {
	public static void main(String[] args) {
		String[] s = { "harsh", "durgesh", "hasbulla", "harsh", "leon" };
		List<String> l = Arrays.asList(s);
		/*
		 * Stream<String> stream = l.stream(); stream.forEach(x ->
		 * System.out.println(x)); int count = (int) stream.filter(x ->
		 * "harsh".equals(x)).count(); //this will print //stream has already been
		 * operated upon or closed System.out.println(count);
		 */
		//1. supplier is interface we can use to reuse supplier interface
		//2.of() is functional method
		
		//Supplier<Stream<List<String>>> inputStream = () -> Stream.of(l);
		Supplier<Stream<String>> inputStream = () -> Stream.of(s);
		inputStream.get().forEach(x -> System.out.println(x));
		
		/*
		 * List<Long> list = inputStream.get().map((x) -> { Stream<String> sx =
		 * x.stream(); return sx.filter(a -> "harsh".equals(a)).count();
		 * }).collect(Collectors.toList()); System.out.println(list.get(0));
		 */
		
		long count=inputStream.get().filter(x -> "harsh".equals(x)).count();
		System.out.println(count);
		
		
		//we can give range value on runtime in IntStream
		/*
		 * int c=10; IntStream.range(0, c).forEach(x -> System.out.println(x));
		 */
	}
}
