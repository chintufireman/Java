package com.enums;

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
			System.out.println(status);
		}
	}
}
