package oops.abstraction;

public class AbstractExample {
	public static void main(String[] args) {
		/*
		 * Bike b = new Bike() {
		 * 
		 * @Override void start() { System.out.println("Vehicle"); } }; b.define();
		 * b.start();
		 */
		
		 new Jeep();
		
	}
	static {
		System.out.println("static block 3");
	}
	
	static { // this only learns when main method is there in class
		System.out.println("static block 2");
	}
	
	
	static class Jeep{
		void define() {
			System.out.println("Jeep");
		}
		static {
			System.out.println("static block");
		}
	}
}


abstract class Vehicle {
	int noOfTyres;

	abstract void start();
}

abstract class Bike extends Vehicle{
	void define() {
		System.out.println("Bike");
	}
}
