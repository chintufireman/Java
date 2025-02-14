package com.enums;

import java.lang.reflect.Constructor;

enum Status{
	RUNNING, FAILED, PENDING, SUCCESS;
}

public class Example {
	public static void main(String[] args) {
		int i=5;
		Status s = Status.RUNNING; 
		System.out.println(s.getClass());
		System.out.println(s.ordinal());
		Status[] ss = Status.values();
		for (Status status : ss) {
//			System.out.println(status);
		}
		SecretKey hmac = SecretKey.HMAC;
		System.out.println(hmac.getAlgo());
	}
}

enum SecretKey{
	
	//these two below are constants
	SHA("USE-SURNAME", "SHA-KEY"), 
	HMAC("USE-NAME", "HMAC-KEY");

//	1. the () after constant names u see is constructor just remember that it is constructor
//	simply.
//	2. the values inside them is two arguments passed to parameterized Constructor
//	3. u have two data members secret and algo which will get initialized as soon as u call
//	constructor of enum.
//	4. and after that u can get values of it from getters
	
	String secret;
	String algo;
	
	SecretKey(String secret, String algo) {
		this.secret = secret;
		this.algo = algo;
	}

	public String getSecret() {
		return secret;
	}

	
	public String getAlgo() {
		return algo;
	}

	
	
	
}
