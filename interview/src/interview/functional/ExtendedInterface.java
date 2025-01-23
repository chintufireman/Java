package interview.functional;

public class ExtendedInterface {

	public static void main(String[] args) {
		Child c = ()->System.out.println("runtime impl of child using lambda express");
		c.write();
	}
}


class ParentImpl implements Parent{

	@Override
	public void hello() {
		System.out.println("hello from parent");
	}

	@Override
	public void write() {
		System.out.println("hello from child");
	}
	
}

@FunctionalInterface
interface Child {
    public void write();
}
interface Parent extends Child{
    public void hello();
}


/*
 * if an functional interface extends another interface which 
 * is having one abstract method and functional interface is also having one 
 * abstract method then in total functional will have 2 abstract method which is not
 * considered a functional like if child extends parent interface then it 
 * wont be considered as functional because parent is having hello method and child
 * also having one write method
 * */
