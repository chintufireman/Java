package cloning.objects;


public class ShallowCopyExample {
	
	public static void main(String[] args) {
		Student s1 = new Student(30, "Shubham");
		
		ClassRoom classRoom = new ClassRoom(s1, 20, "Java");
		System.out.println(classRoom.toString());
		
		try {
			ClassRoom classRoom2 = (ClassRoom) classRoom.clone();
			classRoom2.getS().setName("sawarnim");
			System.out.println(classRoom2.toString());
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(classRoom.toString());
	}
}

class Student {
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class ClassRoom implements Cloneable{
	Student s;
	int no;
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;
	public ClassRoom(Student s, int no, String name) {
		super();
		this.s = s;
		this.no = no;
		this.name = name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student student = new Student(this.s.getRollNo(), this.s.getName());
		ClassRoom classRoom= new ClassRoom(student, this.no, this.name);
		return classRoom;
	}
	@Override
	public String toString() {
		return "ClassRoom [s=" + s + ", no=" + no + ", name=" + name + "]";
	}
	
	
}