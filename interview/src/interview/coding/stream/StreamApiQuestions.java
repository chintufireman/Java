package interview.coding.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class StreamApiQuestions {

	static List<Integer> list = Arrays.asList(1, 4, 25, 6, 290, 89, 23, 25, 76, 12, 2, 4, 1, 55, 62, 2);
	static List<String> fruits = Arrays.asList("apple", "banana", "orange", "guava", "watermelon", "mango", "peach",
			"pomogrenate");

	public static void main(String[] args) {
		printSumOfAllNumbers();
		printAvgOfNumbers();
		findSquareAndAverage();
		findOddAndEvenNumbers();
		printNumberStartsWithN();
		findDuplicate();
		findMinMax();
		partitionListBasedOnEvenAndOdd();
		countingExample();
		summaryOfList();
		getLengthOfEveryStringInList();
		joiningTheDataIntoSingleString();
		groupingByExample();
		collectingAndThenExample();
		mappingExampleInTerminal();
		mapToExample();
		reducingExample();
	}

	static void printSumOfAllNumbers() {
		BinaryOperator<Integer> binaryOperator = (a1, a2) -> a1 + a2;
		Optional<Integer> result = list.stream().reduce(binaryOperator);
		System.out.println("sum of numbers -> " + list.toString() + " is -> " + result.get());
	}

	static void printAvgOfNumbers() {
		ToIntFunction<Integer> toIntFunction = e -> e;

		double avg = list.stream().mapToInt(toIntFunction).average().getAsDouble();
		System.out.println("Average of numbers is -> " + avg);

	}

	// find avg of numbers who's square is above 100
	static void findSquareAndAverage() {
		Function<Integer, Integer> function = x -> x * x;
		ToIntFunction<Integer> toIntFunction = x -> x;
		Predicate<Integer> predicate = x -> x > 100;
		double avg = list.stream().map(function).filter(predicate).mapToInt(toIntFunction).average().getAsDouble();
		System.out.println("Average of squares of numbers is -> " + avg);
	}

	static void findOddAndEvenNumbers() {
		List<Integer> result = list.stream().filter(e -> e % 2 == 0).distinct().sorted().collect(Collectors.toList());
		System.out.println("even numbers are ->" + result.toString());
	}

	static void printNumberStartsWithN() {
		List<Integer> result = list.stream().map(String::valueOf).filter(e -> e.startsWith("2")).map(Integer::valueOf)
				.collect(Collectors.toList());

		System.out.println("Numbers whose prefix starts from 2 is -> " + result.toString());
	}

	static void findDuplicate() {
		Set<Integer> dup = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());

		System.out.println("The duplicates are ->" + dup.toString());

		// another way
		Set<Integer> dupNum = new HashSet<Integer>();
		Set<Integer> dup2 = list.stream().filter(e -> !dupNum.add(e)).collect(Collectors.toSet());

//		System.out.println("The duplicates are ->"+dup2.toString());
//		System.out.println(dupNum.toString());
	}

	static void findMinMax() {
		int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maximum number is " + max + " and minimum is " + min);

	}

	// used when u want to partition data into two groups based on
	// certain condition if its true then one group and false in another group
	static void partitionListBasedOnEvenAndOdd() {

		Predicate<Integer> predicate = x -> x % 2 == 0;
		Map<Boolean, List<Integer>> result = list.stream().collect(Collectors.partitioningBy(predicate));

		System.out.println("Odd and even in the list are" + result.toString());

	}

	static void countingExample() {
		long res = list.stream().collect(Collectors.counting());
		System.out.println("count of data in list is ->" + res);
	}

	static void summaryOfList() {
		// used to find the summary of data where info like
		// count of data, min, max, avg, sum
		IntSummaryStatistics summary = list.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("Summary of data is ->" + summary.toString());
	}

	static void getLengthOfEveryStringInList() {
		// using mapping function of Collectors we can solve it
		List<Integer> result = fruits.stream().collect(Collectors.mapping(String::length, Collectors.toList()));
		System.out.println("List of size of every string in fruits list -> " + result.toString());
	}

	static void joiningTheDataIntoSingleString() {
		// joining the data into single string
		String result = fruits.stream().collect(Collectors.joining(",", "(", ")"));
		System.out.println("Joined string is ->" + result);
	}

	static void groupingByExample() {
		// if u want to basically group of elements with certain condition
		// like based on the words length, or something like that
		// Map<K,D> k is classifier, and D is the result of the downstream collector
		Map<Integer, Long> groupedByLength = fruits.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		// u are seprating based on certain condition and collect them using counting
		System.out.println("Number of words grouped by there length ->" + groupedByLength.toString());
	}

	static void filteringExampleInTerminal() {
//		List<Integer> result = list.stream().collect(Collectors.f) not importing filtering method
	}

	static void collectingAndThenExample() {
		int size = fruits.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Set::size));
		System.out.println("fruits inside the set is added and size is ->" + size);
	}

	static void mappingExampleInTerminal() {
		int sum = fruits.stream().collect(Collectors.mapping(String::length, Collectors.summingInt(Integer::intValue)));
		System.out.println("Collecting length of all STRIng in list and summing them " + sum);
	}

	static void mapToExample() {
		// convert the list to map in which key as fruit name and
		// value as a length

		Map<String, Integer> map = fruits.stream().collect(Collectors.toMap(e -> e, String::length));
//		Map<String, Integer> map = fruits.stream().collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println("Map in which key as a fruit and value as length " + map.toString());
	}
	// check toConcurrentMap

	static void reducingExample() {
		int sum = list.stream().collect(Collectors.reducing(0, Integer::sum));
		System.out.println("summ of all element is using reducing in terminal " + sum);
	}
}
