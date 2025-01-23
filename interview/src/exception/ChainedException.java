package exception;

public class ChainedException {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			Throwable cause = e.getCause(); // Retrieve the cause
            if (cause != null) {
                System.out.println("Cause: " + cause.getMessage());
            }
            e.printStackTrace();

		}
	}
	
	static void method1() throws Exception {
		try {
			method2();
		}
		catch(Exception e) {
			 Exception newException = new Exception("Exception in method1");
	            newException.initCause(e); // Initialize the cause
	            throw newException;
		}
	}
	
	static void method2() throws Exception {
		throw new Exception("Original Exception in method2");
	}
}
