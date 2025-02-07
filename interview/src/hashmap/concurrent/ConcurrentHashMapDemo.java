package hashmap.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
	//in java 7--> it works as segment base locking 
//		which means our map will be divided into 16 segments which means smaller hashmaps
//		segment means smaller parts and every segment will have its own lock
//		so suppose u want to read something so we will lock only particular segment
//		of data and lock it and others wont be locked
//		Only the segment which is being written to or read from is locked
		
//		read operation does not require locking unless there is write operattion happening
//		on the same segment but write operation require
//		this all story is for java 7
		
//		java 8--> 1. removes whole process of segmentation because of scalability
//		issue as the 16 segment is very large 
//		2.if u want to update 4-5 segments simultaneously then u have to wait for it
//		3. java 8 uses compare and swap approach, no locking is use except resizing or 
//		collision case because in this case locking is required else no locking is required
//		
//		4. suppose x = 42 and Thread A last saw that x= 42 and thread A job is to make 
//		x=50, so compare and swap checks if x is still 42 then change is to 50 else 
//		don't change and retry, some other thread might have changed the x to 45
//		then it will go back to last saw process then it will check into which value
//		it needs to be updated now x=45 and needs to be updated to 50 okay, if 
//		last saw now is x=45 and value has not been changed then change x to 50 else
//		retry again and keep checking like this
//		
//		5.the problem is it will keep looking again and again so what CAS algorithm will 
//		do is if it keeps getting failed then it will wait for sometime it will back off 
//		for sometime, the map will wait for some time and come back after short random
//		time so that there is no cpu wastage
		
//		6. in collision we have to play with linkedlist and things get very complicated
//		and when resizing happens due to load factor during that time the map and 
//		concurrent hash map has different conventional way to resize map.
//		in concurrent hash map nothing gets doubled incremental thing happen
		
//		7. suppose u add one more bucket and it might be possible two threads come
//		and try to hold that new bucket only in that case lock is needed
	
	}
}
