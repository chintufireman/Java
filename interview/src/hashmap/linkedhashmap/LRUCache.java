package hashmap.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LRUCache<K,V> extends LinkedHashMap<K, V>{

	int capacity;
	LRUCache(int capacity){
		super(capacity, 0.75f, true);
		this.capacity = capacity;
	}
	
	@Override
	protected boolean removeEldestEntry(Entry<K, V> eldest) {
		return size() > capacity;
	}

	public static void main(String[] args) {
		LRUCache<String, Integer> cache = new LRUCache<>(3);
		cache.put("Orange", 3);
		cache.put("Apple", 3);
		cache.put("Mango", 3);
		
//		System.out.println(cache.toString());
//		{Apple=3, Mango=3, banana=3}
//		we have overrided removeEldestEmtry method and inside that we have written logic
//		if size is greater than capacity then return true which will remove least recently
//		used orange
		
//		but what happens when we do 
		cache.get("Orange");
//		u wont get output nothing new because when u added 4th entry of banana
//		the remove eldest entry method started at that point only
//		this remove eldest entry method  runs only when u use put method
		cache.put("banana", 3);
		System.out.println(cache.toString());
//		{Mango=3, Orange=3, banana=3}
//		when u get orange it goes to the bottom of map still as its access order is true
//		but when u added 4 th element in map with put method it invoked the overrided 
//		method and removed least recently used or not used which is apple
//		understand in depth how it works
	}
}
