package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

public class StudentDao {
	public static boolean insert(Student st) {
		// jdbc code
		boolean f= false;
		try {
			Connection c = ConnectionProvider.create();
			String s = "insert into students(sname,sphone,scity) values(?,?,?)";
			//prepared Statement
			PreparedStatement pstmt = c.prepareStatement(s);
			//set the value of parameter
			 pstmt.setString(1, st.getName());
			 pstmt.setString(2, st.getPhone());
			 pstmt.setString(3, st.getCity());
			 
			 //execute....
			 pstmt.executeUpdate();
			 f=true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	} 
	
	public static boolean delete(int id) {
		boolean f= false;
		try {
			Connection c = ConnectionProvider.create();
			String s = "delete from students where sid=?";
			//prepared Statement
			PreparedStatement pstmt = c.prepareStatement(s);
			//set the value of parameter
			 pstmt.setInt(1,id);
			 //execute....
			 pstmt.executeUpdate();
			 f=true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	public static  List<Student> showAll() {
		List<Student> l = new ArrayList<Student>();
		Student student;
		try {
			Connection c = ConnectionProvider.create();
			String s = "select * from students";
			//create Statement
			java.sql.Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(s);
			while(rs.next()) {
				student = new Student();
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String phone= rs.getString(3);
				String city= rs.getString(4);
				student.setId(id);
				student.setCity(city);
				student.setName(name);
				student.setPhone(phone);
				l.add(student);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}
}
