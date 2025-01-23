package inheritance;

public class OveridingStaticMethod {
	public static void main(String[] args) {
		
		parent p = new child();
		
		p.method1();
		//here 
	}
}
class parent {
	public static void method1() {
		System.out.println("method1  of parent");
	}
}
class child extends parent{
	
	public static void method1() {
		System.out.println("method 2 of child  ");
	}
}