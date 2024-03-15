package com.connect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class CollableDemo {
	
	static Scanner sc=new Scanner(System.in);
	Statement st;
	CallableStatement cst;
	ResultSet rs;
	static Connection con=null;
	
	CollableDemo()
	{
		con=DBConnect.getConnect();
		System.out.println("Connection done");
		
		try {
			st=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getFacultySalary() {
		System.out.println("Enter faculty id:");
		int id=sc.nextInt();
		
		try {
			cst=con.prepareCall("{?= call FacultySalaryById(?)}");
			cst.registerOutParameter(1,Types.FLOAT);
			cst.setInt(2, id);
			
			cst.execute();
			System.out.println("salary is:"+cst.getFloat(1));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void getStudentByCourseProcedure() {
		System.out.println("Enter the course name");
		String name=sc.next();
		
		try {
			cst=con.prepareCall("{call getSTudentByCourse(?)}");
			cst.setString(1, name);
			
			boolean status=cst.execute();
			boolean isRecord=false;
			if(status) {
				rs=cst.getResultSet();
				while(rs.next()) {
					isRecord=true;
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getDate(7)+" "+rs.getDate(8));
					
			}
		}
			if(!isRecord) {
				System.out.println("NO record found in this course");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void studentCountProc() {
		System.out.println("Enter the course id");
		int id=sc.nextInt();
		
		try {
			cst=con.prepareCall("{call getStudentCount(?)}");
			cst.setInt(1, id);
			cst.registerOutParameter(2, Types.VARCHAR);
			cst.registerOutParameter(3, Types.INTEGER);
			
			cst.execute();
			
			System.out.println("course id:"+id);
			System.out.println("Course name:"+cst.getString(2));
			System.out.println("no of students:"+cst.getInt(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollableDemo obj=new CollableDemo();
		//obj.getFacultySalary();
	//	obj.getStudentByCourseProcedure();
		
		obj.studentCountProc();
		
		
	}

}
