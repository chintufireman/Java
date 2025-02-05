package hashmap;

import java.util.HashMap;
import java.util.Objects;

public class HashMapDemo {
	public static void main(String[] args) {
		Student student = new Student(0, "name");
		Student student2 = new Student(1, "name2");
		Student student3 = new Student(0, "name");
		
		//by default class will have equals and hashcode as 
		//every class implements object class
//		
//		in class how hashcode is generated? 
//		it generates hashcode by using memory address of object

	HashMap<Student, Integer> hashMap = new HashMap<>();
	hashMap.put(student, 3); //neww hashcode -->index
	hashMap.put(student2, 34); //new hashcode-->index
	hashMap.put(student3, 31); //new hashcode-->index 
//	the student and student3 should have the same hashcode because data inside both 
//	the objects are same so that's why generate same hashcode. to do that
//	you have to override hashcode and equals method
	System.out.println(hashMap.size());
	System.out.println(hashMap.toString());
	
//	see by overriding hashcode of class what will happen is object will generate 
//	hashcode based on data and because hash is being generated based on object's data
//	instead of Object's memory address it will generate same hash for every different object
//	with same data inside them
	
//	and while putting data or getting data inside the map it will check two objects 
//	are same or not based
//	on data only and not on their memory addresses because we have overrided equals method
//	and for student class equals is checking equality based on data 
	
	HashMap<String, Integer> s = new HashMap<String, Integer>();
	s.put("SHub",2);
	s.put("S", 22);
	s.put("SHub", 3); //at this point it will generate Hashcode again which has been
	//generated already which will give same hash only and if hash is same it generate index
//	and after that it check if the element present at index is same if yes then
//	what hashmap does is it overrides the old value of same key with new value
	}
}

class Student{
	int id;
	String name;
	
	public Student(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		Student s1 = (Student) obj; //to cast this object into student
		return s1.id == id && Objects.equals(s1.name, name);
//		u could have also written this s1.name.equals(name) but if passed parameter
//		might be null string so to avoid null pointer exception we use this
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}