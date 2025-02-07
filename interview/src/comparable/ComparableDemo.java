package comparable;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student(9, "Charlie"); //add 09 and u get this error 
		//The literal 09 of type int is out of range 
		Student s2 = new Student(04, "Charlie");
		Student s3 = new Student(01, "Charlie");
		Student s4 = new Student(20, "Charlie");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.sort(null);
//		null means u are not giving COMPARATOR and it is given when u have to write
//		custom logic
//		and null means it should have natural ordering 
//		what does natural ordering means? we have to explain the class the ordering
//		by implementing COMPARABLE
		
//		this is big difference between comparator and comparable
		System.out.println(list);
	}
}

//1. two compare two objects outside of class externally we write comparator and overrid 
//compare method
//2. when we have to internally compare two object like object1.compareto(object2) then
//we use comparable by impl its interface Comparable and overrid compareto method

class Student implements Comparable<Student>{
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id =id;
		this.name=name;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(o.id, this.id);
	}
	
	@Override
	public String toString() {
		return "id:-> "+id + " name:-> "+name;
	}
}