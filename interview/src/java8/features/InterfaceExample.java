package java8.features;

//by default if u create a variable inside the interface it becomes Final or constant

@FunctionalInterface
interface Demo {
	void abc();

	default void show() {
		System.out.println("In demo show");
	}
}

interface MyDemo {
	default void show() {
		System.out.println("In MyDemo show");
	}
}

class DemoImpl implements Demo, MyDemo {

	@Override
	public void abc() {
		System.out.println("Hello from abc");
	}
	@Override
	public void show() {
		System.out.println("This is DemoImpl");
	}
	/*@Override
	public void show() {
		MyDemo.super.show();
	}*/
	/*@Override
	public void show() {
		Demo.super.show();
	}*/

}

public class InterfaceExample {
	public static void main(String[] args) {
		Demo a = new DemoImpl();
		a.abc();
		a.show();
	}
}
