package com.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	static Connection con=null;
	public static Connection getConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver is loaded");
			
			//create connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Mandar");
			//System.out.println("connction established");		
		}catch (Exception e) {
		 System.out.println(e);
		}
		return con;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getConnect();
	}

}
