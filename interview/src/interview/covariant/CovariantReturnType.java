package interview.covariant;

public class CovariantReturnType {
	public static void main(String[] args) {
		Third t = new Third();
		t.define();
	}
}

class First {
	First(){
		System.out.println("First Class");
	}
}

class Fourth extends First{
	static int a = 40;
	Fourth(){
		System.out.println("this is fourth");
	}
}

class Third {
	static int a = 30;
	
	First define() {
		System.out.println("THis is third");
		return new Fourth();
	}
}