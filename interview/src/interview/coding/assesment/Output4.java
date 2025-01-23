package interview.coding.assesment;

class ThreadClass extends Thread{
	public ThreadClass() {
		System.out.println(Thread.currentThread().getPriority());//deafult priority of thread is 5
	}

}
public class Output4 {
	public static void main(String[] args) {
		new ThreadClass();
	}
	
}

