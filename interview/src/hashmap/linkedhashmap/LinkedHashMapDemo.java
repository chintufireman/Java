package hashmap.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map = 
				new LinkedHashMap<String, Integer>(11,0.3f,true);
		
//		by default access order is false which means whatever thing u put in map
//		it will maintain its insertion order. 
//		{Orange=2, Apple=23, Mango=22}

		map.put("Orange", 2);
		map.put("Apple", 23);
		map.put("Mango", 22);
		System.out.println(map.toString());
//	we will get output in the inserted order but 
		map.get("Apple");
		System.out.println(map.toString());
//		{Orange=2, Mango=22, Apple=23}
//		why apple is in end now? because u have now made access order true which 
//		means whenever u get that key it takes that k-v pair at the end of 
//		map. in this case u have accessed apple first so first it will take apple
//		at the end of list
		map.get("Orange");
		System.out.println(map.toString());
//		{Mango=22, Apple=23, Orange=2}

//		now u might have question if this maintains access order then the key which have
//		accessed latest or used might come first why it here it is happening in reverse?
		
//		there is one mechanism called as least recently used in this mechanism or algorithm
//		what we do is we keep track of those elements which are least recently accessed
//		suppose there are things which are old which are not getting used, which things 
//		are not getting used lets keep it at top of map, so in this case mango is at top
//		because if u might want to remove mango first as it is least recently used or not used
		
//		suppose u have been told to remove those elements which are least recently used in
////		programs
//		map.get("Apple");
//		map.get("Orange"); 
//		map.get("Mango");
//		map.get("Mango");
//		map.get("Orange");
//		map.get("Orange");
//		map.get("Apple");
//		map.get("Mango");
//		System.out.println(map.toString()); 
		//{Orange=2, Apple=23, Mango=22}

//		so u dont have to check one by one throughout whole code u can just make access order
//		true and remove them as u will get at top least recently used
	
//		use case:- 
//		in caching there is cache eviction strategy, when u are caching everything then 
//		this will create issue of disk full so what thing u can remove is least recently used
//		up things
	}
}
