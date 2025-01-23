package interview.coding.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlattenMap {
	public static void main(String[] args) {
		List<List<Map<String, Integer>>> listOfLists = new ArrayList<>();

		// Creating the first list of maps
		List<Map<String, Integer>> list1 = new ArrayList<>();
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("a", 1);
		map1.put("b", 2);
		list1.add(map1);

		Map<String, Integer> map2 = new HashMap<>();
		map2.put("c", 3);
		map2.put("c", 4);
		list1.add(map2);

		// Creating the second list of maps
		List<Map<String, Integer>> list2 = new ArrayList<>();
		Map<String, Integer> map3 = new HashMap<>();
		map3.put("e", 5);
		map3.put("f", 6);
		list2.add(map3);

		Map<String, Integer> map4 = new HashMap<>();
		map4.put("g", 7);
		map4.put("h", 8);
		list2.add(map4);

		// Adding lists to the listOfLists
		listOfLists.add(list1);
		listOfLists.add(list2);

		// Flatten the nested lists into a single list of maps
		
		 List<Map<String, Integer>> flattenedList = listOfLists.stream()
	                .flatMap(List::stream) // Flatten the list of lists
	                .collect(Collectors.toList());
		 List<Collection<Integer>> listInt =flattenedList.stream().map(map->map.values()).collect(Collectors.toList());

		 List<Integer> ll =listInt.stream().flatMap(Collection::stream).collect(Collectors.toList());
		 System.out.println(ll.toString());
		 
		 
		 List<Integer> allValues = listOfLists.stream()
	                .flatMap(List::stream) // Flatten the list of lists
	                .map(map->map.values()) // Get the values of each map
	                .flatMap(Collection::stream) // Flatten the stream of values
	                .collect(Collectors.toList());
				System.out.println("Flattened list of maps: " +allValues );
	}
}
