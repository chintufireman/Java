package com.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.List;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {
	public static void main(String[] args) throws Exception{
		System.out.println("Program started....");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to ADD STUDENT");
			System.out.println("Press 2 to DELETE STUDENT");
			System.out.println("Press 3 to DISPLAY STUDENT");
			System.out.println("Press 4 to EXIT STUDENT");
			int c = Integer.parseInt(bf.readLine());
			if(c ==1) {
				//add student
				System.out.println("Enter name");
				String name = bf.readLine();
				System.out.println("Enter city");
				String city = bf.readLine();
				System.out.println("Enter phone");
				String phone = bf.readLine();
				
				//create student object
				Student s = new Student(name,city,phone);
				boolean ans = StudentDao.insert(s);
				if(ans) {
					System.out.println("Student added successfully...");
				}
				else {
					System.out.println("Something went wrong....");
				}
			}
			else if( c==2 ) {
				//delete student
				System.out.println("Enter student id to delete");
				int id = Integer.parseInt(bf.readLine());
				boolean ans = StudentDao.delete(id);
				if(ans) {
					System.out.println("Student deleted successfully...");
				}
				else {
					System.out.println("Something went wrong....");
				}
			}
			else if( c==3 ) {
				//display student
				List<Student> l =StudentDao.showAll();
				l.stream().forEach(x-> System.out.println(x));
			}
			else if( c==4 ) {
				//exit
				break;
			}
			else {
				
			}
		}
	}
}
