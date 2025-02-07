package hashmap;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {
		SortedMap<String, Integer> map = new TreeMap<>();
//		sorted map is interface whose implementation class tree map and gurantees that
//		the entries inside are sorted based on the keysd either in their natural ordering
//		or by a specified comparator
		
//		Tree map is self balancing binary tree aka red black tree
		
//		tree map also implements NavigableMap<k, V> which extends sorted map
//		navigable map provides more powerful navigation options such as finding 
//		the closest matching key or retrieving the map in reverse order
		map.put("manish", 90);
		map.put("panish1", 19);
		map.put("aanish2", 56);
		map.put("danish3", 43);
		map.put("canish4", 78);
		System.out.println(map);
//		{aanish2=56, canish4=78, danish3=43, manish=90, panish1=19}
//		we can also use Map instead of sorted map becaue it extends 
//		map only but then SortedMap is needed because it provides some additional
//		function.
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap("pa"));
//		{aanish2=56, canish4=78, danish3=43, manish=90}
//		till what u want data
		
		System.out.println(map.tailMap("pa"));
//		{panish1=19}

		NavigableMap<Integer, String> navigableMap = new TreeMap<>();
		navigableMap.put(1, "orange");
		navigableMap.put(23, "apple");
		navigableMap.put(4, "mango");
		System.out.println("Navigable map:- "+navigableMap);
		//Navigable map:- {1=orange, 4=mango, 23=apple}
		System.out.println(navigableMap.lowerKey(5));; //just below 5 key which is 4
	}
}
