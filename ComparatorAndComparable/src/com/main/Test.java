package com.main;

import java.time.LocalDate;
import java.util.*;

import com.main.p2.C;

public class Test  {
	

	static List<String> list= new ArrayList<String>();

	public static void main(String[] args) {
		String s1 = "inf";
		String s2 = "inf";
		System.out.println(s1.equals(s2));
	}

	public static void displayName(String name, int...id) {
		System.out.print("Registration for "+name+": ");
		for (int i = 0; i < id.length; i++) {
			System.out.print(id[i]+" ");
		}
	}

	static List<String> getList() {
		if(list.size()==0)
			return null;
		else
			return list;
	}
}

class Base{

	public Base(String name) {
		System.out.println(name);
	}

	public static void displayName() {
		System.out.println("Base");
	}

	public static void method(int a) {
		System.out.println("Base method");
	}

//	public void method1() {
//		System.out.println("MyMethod");
//	}

}

class D extends Base {
	public D(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void method(int a) {
		System.out.println("Der");
	}

}
interface MyInterface{
	void method1();
}