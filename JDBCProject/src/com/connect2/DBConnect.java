package com.connect2;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	static Connection con=null;
	 public static final String url="jdbc:mysql://localhost:3306/bikeshowroomdatabase";
	 public static final String user="root";
	 public static final String pass="Mandar";
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			con=DriverManager.getConnection(url, user, pass);
			System.out.println("connection loaded");

		} catch (Exception e) {

			e.printStackTrace();
		}
		return con;
		
	}
	public static void main(String[] args) {
		getConnection();
	}
}
