package exception;

import java.io.IOException;

public class ChainedException {

	public static void main(String[] args) {
//		try {
//			method1();
//		} catch (Exception e) {
//			Throwable cause = e.getCause(); // Retrieve the cause
//            if (cause != null) {
//                System.out.println("Cause: " + cause.getMessage());
//            }
//            e.printStackTrace();
//
//		}
		
		A a = new B();
		a.throwException();
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

class A{
	A(){
		System.out.println("A initiated");
	}
	
	void throwException() {
		System.out.println("do something in A");
	}
}
class B extends A{
	B(){
		System.out.println("B initiated");
	}
	
	@Override
	void throwException() {
		try {
		throw new IOException();
		}
		catch(IOException e) {
			
		}
	}
}