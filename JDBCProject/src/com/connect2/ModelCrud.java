package com.connect2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ModelCrud {
	static Connection con=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	static Scanner sc=new Scanner(System.in);
	
	ModelCrud(){
		con=DBConnect.getConnection();
		System.out.println("Connection done");
		
		try {
			st=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fetchModelDetails() {
		try {
			rs=st.executeQuery("Select * from bike");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteModel() {
		System.out.println("Enter bike id to delete");
		int id=sc.nextInt();
		
		try {
			int noofrowsDeleted=st.executeUpdate("delete from bike where bikeid="+id);
			if(noofrowsDeleted>0) {
				System.out.println("bike "+id+" is deleted");
				fetchModelDetails();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertModel() {
		System.out.println("Enter model id:");
		int id=sc.nextInt();
		System.out.println("Enter model name");
		String bname=sc.next();
		System.out.println("Enter price");
		float price=sc.nextFloat();
		
		try {
			pst=con.prepareStatement("insert into bike values(?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, bname);
			pst.setFloat(3, price);
			
			int noofrowsInserted=pst.executeUpdate();
			if(noofrowsInserted>0) {
				System.out.println("model added");
				fetchModelDetails();
			}else {
				System.out.println("error");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean searchModelById(int id) {
		boolean isFound=false;
		
		try {
			pst=con.prepareStatement("select * from bike where bikeid=?");
			pst.setInt(1, id);
			rs=pst.executeQuery();
			
			while(rs.next()) {
				isFound=true;
				System.out.println("Model id:"+rs.getInt(1));
				System.out.println("Model Name:"+rs.getString(2));
				System.out.println("Model Price:"+rs.getFloat(3));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isFound;
	}
	
	public void updateModel() {
		System.out.println("Enter the model id to update:");
		int id=sc.nextInt();
		
		
		
	}
	public static void main(String[] args) {
		ModelCrud obj=new ModelCrud();
		obj.fetchModelDetails();
		System.out.println("--------------------------------------");
		//obj.deleteModel();
		//obj.insertModel();
		System.out.println("enter id to search model");
		int id=sc.nextInt();
		if(!obj.searchModelById(id)) {
			System.out.println("not found");
		}
		
	}

}
