package hashmap.concurrent;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {

	public static void main(String[] args) {
		
		
		
//		1. 1,2,3,45,6 this is normal list now what is skip list?
//			it is a probablistic data structure that allows for efficient search,
//		insertion and deletion operations.
//		
//		2. it is similar to sorted linked list but with multiple layers that SKIP 
//		over portions of the list to provide faster access of elements
		
//		suppose, 1,3,4,5,6,7,8,9,10 is a list which is now divided into multiple
//		layers like 
//		
//		3. 1,3,4,5,6,7,8,9,10 --> first layer all elements are present
//		2. 1,4,6,8,10 --> few elements skiped
//		1. 1,6,10 --> few more emlements skiped
//		
//		these are multiple layers of linked list which are stored in sorted order
//		now if u want to search 3 u will first go to layer 31and then u see it is 
//		smaller than 6 then lets go to anoterh layer 2 then u see 4 is still bigger
//		lets go one more layer below layer 1 and see 3 is present there
//		
//		4. in normal tree map we have to use red black tree to do self balancing 
//		which needs complex algorithms whose need is not here 
//		
//		5. here insertion is not strick like if u are inserting 2 here then its 
//		not sure that u will have to touch linkedlist 1, 2 or 3 here things are done
//		randomly in red black tree if u insert something u have to do constant 
//		balancing 
		
//		6. in concurrent skip list u are storing data in skiplist data structure 
		
		ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
//		1. if u have to sort things then use tree map
//		2. if u need closest node like first entry last entry, etc then use navigable map
//		3. if u want concurrency then use concurrent hash map
//		4. if u want things sorted with concurrency then use concurrent skip list map 
	}
}
