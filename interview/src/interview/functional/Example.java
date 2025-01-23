package interview.functional;

interface Functional {
	void show();
}

public class Example {
	public static void main(String[] args) {
		//this is functional interface example
		Functional f = () -> System.out.println("Im dangerous");
		f.show();
	}
}
