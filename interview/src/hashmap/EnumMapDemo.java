package hashmap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {

	public static void main(String[] args) {
		Map<DAY, String> map = new EnumMap<>(DAY.class);
//		1.if all the key values in a map are values from single enum, it is recommended to 
//		use an enummap as the specific implementation
//		
//		2.as enum map has one advantage of knowing all possible keys in advance which
//		is more efficient compared to other implementations.
		
//		3. like other maps we first get hashcode of key then index and then we add it inside
//		the bucket but here in enum inside that the data is inside the array which has 
//		its own index
		
		map.put(DAY.FRIDAY, "friday");
		System.out.println(DAY.FRIDAY.ordinal());
//		4. so when we do put() it does not create hashcode it simple maps to DAY's enum
//		friday's index which is also called as ordinal with data or value no need of index.
		map.put(DAY.MONDAY, "Boxing");
		System.out.println(map);
		//{MONDAY=Boxing, FRIDAY=friday}
//		 it will print in the order in which way u have defined the enum array or data
//		 inside it. oridnal/index is used of enum to maintain data
	}
}

enum DAY{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}