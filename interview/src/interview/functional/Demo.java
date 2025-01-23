package interview.functional;

@FunctionalInterface
interface Hello {
	void abc();

	default void print() {
		System.out.println("Hello world");
	}
	//the reason it is still functional interface is becoz funtional interfaces can have only
	//one abstract method
}

class HelloImpl implements Hello {

	@Override
	public void abc() {
		System.out.println("This is best");
	}
	
	@Override
	public void print() {
		System.out.println("Im bad at dsa");
	}
}

public class Demo {
	public static void main(String[] args) {
		Hello h = new HelloImpl();
		h.abc();
		h.print();
		
	}
}

