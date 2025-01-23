package oops.interfaceproperty;

public class InterfaceExample {
	public static void main(String[] args) {
		Animal2 a = new Animal2() {
			@Override
			 public void eat() {
				System.out.println("Dog");
			}
		};
		Dog d = (Dog)a;
		d.eat();
	}
	
	OverridingStatic o = new OverridingStatic();
}
 interface Animal {
	public void eat();
}

 interface Horse {
	   public void eat();
	}
 interface Dog {
	 public void eat();
 }
 interface Animal2 extends Dog, Horse{	 
 }
 
 class OverridingStatic{
	public void digest() {
		 System.out.println("Parent class");
	 }
 }
 class Derived extends OverridingStatic{
	  public void digest() {
		 System.out.println("Derived class");
	 }
 }
 