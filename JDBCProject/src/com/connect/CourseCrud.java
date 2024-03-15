package com.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CourseCrud {
	
	static Connection con=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	static Scanner sc=new Scanner(System.in);
	CourseCrud(){
		con=DBConnect.getConnect();
		System.out.println("Connection done");
		
		try {
			st=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fetchCourseDetails() {
		try {
			rs=st.executeQuery("select * from course");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getFloat(4)+" "+rs.getInt(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteCourse()
	{
		System.out.println("Enter the course id  to be deleted");
		int id=sc.nextInt();
		
		try {
			int noofRowsDeleted=st.executeUpdate("delete from course where courseid="+id);
			if(noofRowsDeleted>0) {
				System.out.println("course "+id+" id deleted");
				fetchCourseDetails();
			}else
			{
				System.out.println("Error");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void insertCourse() {
		
		System.out.println("Enter the course id");
		int cid=sc.nextInt();
		System.out.println("Enter course name");
		String cname=sc.next();
		System.out.println("Enter duration in month");
		int dur=sc.nextInt();
		System.out.println("Enter fee:");
		float fees=sc.nextFloat();
		
		try {
			pst=con.prepareStatement("insert into course values(?,?,?,?,?)");
			pst.setInt(1, cid);
			pst.setString(2, cname);
			pst.setInt(3, dur);
			pst.setFloat(4, fees);
			pst.setInt(5, 0);
		
			int noofrowsInserted=pst.executeUpdate();
			if(noofrowsInserted>0) {
				System.out.println("course added");
				fetchCourseDetails();
			}else {
				System.out.println("error");
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
		public boolean searchCourseById(int id) {
			boolean isFound=false;
			
			try {
				pst=con.prepareStatement("select * from course where courseid=?");
				pst.setInt(1, id);
				rs=pst.executeQuery();
				while(rs.next()) {
					isFound=true;
					System.out.println("ID:"+rs.getInt(1));
					System.out.println("ID:"+rs.getString(2));
					System.out.println("ID:"+rs.getInt(3));
					System.out.println("ID:"+rs.getFloat(4));
					System.out.println("ID:"+rs.getInt(5));	
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return isFound;
			
		}
		
		public void updateCourseFees() {
			System.out.println("Enter the course id to update");
			int id=sc.nextInt();
			
			if(searchCourseById(id)) {
				System.out.println("-----------------------");
				System.out.println("ENter the new fees");
				float fees=sc.nextFloat();
				
				try {
					pst=con.prepareStatement("update course set fees=? where courseid=?");
					pst.setFloat(1, fees);
					pst.setInt(2, id);
					
					int noofrowsUpdates=pst.executeUpdate();
					if(noofrowsUpdates>0) {
						System.out.println("course updated");
						searchCourseById(id);
					}else {
						System.out.println("Error");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else
			{
				System.out.println("Course not found");
			}
		}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseCrud obj=new CourseCrud();
		int choice;
		char ch;
		
		do {
			System.out.println("--------------------------");
			System.out.println("1.Add new course");
			System.out.println("2.delete course");
			System.out.println("3.updae course");
			System.out.println("4.view all course");
			System.out.println("5.view course by id");
			System.out.println("6.exit");
			
			System.out.println("Enter your choice");
			System.out.println("------------------");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				obj.insertCourse();
				break;
			case 2:
				obj.deleteCourse();
				break;
			case 3:
				obj.updateCourseFees();
				break;
			case 4:
				obj.fetchCourseDetails();
				break;
			case 5:
				System.out.println("Enter course id to serach");
				int id=sc.nextInt();
				if(!obj.searchCourseById(id)) {
					System.out.println("Not found");
				}
				break;
			case 6:
				System.out.println("-------------closing the course application-----------");
				System.exit(0);
				break;
				
				default:System.out.println("Wrong input");
			}
			System.out.println("Do you want to perform more operations(yes-y/no-n)");
			ch=sc.next().charAt(0);
		} while (ch=='y'|| ch=='Y');
		
		
	}

}
