package inheritance;

public class AmbigiousMethod {

	public static void main(String[] args) {
		A a = new A();
		//a.fun(null);
	}
}
class A {
	
	void fun(Integer i) {
		System.out.println("integer");
	}
	void fun(String i) {
		System.out.println("string");
	}
}