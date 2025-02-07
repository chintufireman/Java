package hashmap;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) throws InterruptedException {
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		
		//hashtable is synchronized in nature
		//no null key nor null value present
		//legacy class replaced by concurrenthashmap
		hashtable.put(1, "rahul");
		System.out.println(hashtable);
		
		Thread t1 = new Thread(()->{
			for(int i=0;i<100;i++) {
				hashtable.put(i, "Thread 1");
			}
		});
		Thread t2 = new Thread(()->{
			for(int i=100;i<200;i++) {
				hashtable.put(i, "Thread 2");
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(hashtable.size());
		//all methods are thread safe
//		this actually disadvantage of using it 
//		because every method is thread safe and locked
	}
}
