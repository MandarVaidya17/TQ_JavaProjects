package com.connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FecultyCrud {
	static Connection con=null;
	Statement st;
	ResultSet rs;
	
	FecultyCrud(){
		con=DBConnect.getConnect();
		System.out.println("Connection done");
		
		try {
			st=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fetchFaculty() {
		try {
			rs=st.executeQuery("select * from faculty");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getInt(7)+rs.getDate(8));
	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FecultyCrud obj=new FecultyCrud();
		obj.fetchFaculty();
	}

}
