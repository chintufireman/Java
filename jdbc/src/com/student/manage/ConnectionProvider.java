package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	static Connection cn;

	public static Connection create() {
		// 1.load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2.create the connection...
			String user = "root";
			String passwd = "root";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			cn = DriverManager.getConnection(url, user, passwd);
		} catch (Exception e) {

		}
		return cn;
	}
}
