package hashmap.weakhashmap;

import java.lang.ref.WeakReference;

public class WeakReferenceExample {

	public static void main(String[] args) {
		WeakReference<Person> weakReference = 
				new WeakReference<>(new Person(10, "Suresh"));
		//the above object is weakreference usually when u create object in this way
		// it is considered as weakreference and when u create it in normal way
//		its considered as strong reference
		System.out.println(weakReference.get()); //id: 10 Name: Suresh
		
//		this will give a normal o/p but what if we sleep the thread for 10 sec 
//		then what happens check
		
		try {
			Thread.sleep(10000);
		}
		catch(Exception e) {}
		System.out.println(weakReference.get());//id: 10 Name: Suresh
//		normal o/p nothing will be deleted 
//		what jvm thinks of weak reference that this reference is not that much imp
//		i can remove this anytime if i wanted to 

//		let's do 
		System.gc();
		System.out.println(weakReference.get());
//		now it will remove the data 
		
	}
}

class Person{
	int id;
	String name;
	public Person(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "id: "+id +" Name: "+name;
	}
}