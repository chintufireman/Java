package interview.coding.assesment;

public class Output3 {
	
	//both ways are correct
	
	public static void main(String[] args) {
		MyFactory factory = new MyFactory() {
			
			@Override
			public void build() {
			System.out.println("main");
			}
		};
		factory.build();
	}
}

interface MyFactory {
	void build();
}

class MyfactoryImpl implements MyFactory{
	@Override
	public void build() {
		System.out.println("inside Myfactory impl");
	}
}