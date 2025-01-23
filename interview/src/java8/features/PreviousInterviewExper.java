package java8.features;

class A {
	int a = 0;

	A(int a) {
		a = a;
	}
	A(){
		a=10;
	}
}

public class PreviousInterviewExper {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
	}
}
