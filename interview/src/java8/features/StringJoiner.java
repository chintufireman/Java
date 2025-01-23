package java8.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringJoiner {
	public static void main(String[] args) {
		String input ="Hello how are u";
		String inputArr[] = input.split(" ");
		System.out.println(inputArr);
		Arrays.asList(inputArr).stream().forEach(x->System.out.println(x));
		StringBuilder sb = new StringBuilder();
	//Arrays.asList(inputArr).stream().
	}
}
