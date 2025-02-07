package hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 1);
		map.put("C", 1);
		Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);
//		Returns an unmodifiable view of the specified map
		unmodifiableMap.put("c", 1);
		System.out.println(unmodifiableMap);
//		java.lang.UnsupportedOperationException
//		this is above one is unmodifiable map but there is one drawback though u cannot
//		change the new map the above passed map in parameter can be changed
		
		Map.of("Akshit",2,"Rahul", 90);
		
	}
}
