package interview.coding.assesment;

public class Output {
	public static void main(String[] args) {
		ChildFigure t = new ChildFigure();
		t.display();
		Figure f = (Figure)t;
		f.display();
	}
}
 interface Test{
	void display();
}
 
 class Figure implements Test{

	@Override
	public void display() {
		System.out.println("inside class figure");
	}
	 
 }
 class ChildFigure extends Figure{
	 
	 @Override
	 public void display() {
		 System.out.println("inside class Child figure");
	 }
	 
 }