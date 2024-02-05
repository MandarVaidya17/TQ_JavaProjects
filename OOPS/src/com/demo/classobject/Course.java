package com.demo.classobject;

public class Course {
	 
	int courseid;
	String coursename;
	double coursefee;
	
	public void setData(int cid,String cname,double cfee) {
		courseid=cid;
		coursename=cname;
		coursefee=cfee;
	}
	public void displayData() {
		System.out.println("ID:"+courseid);
		System.out.println("Name:"+coursename);
		System.out.println("Fee:"+coursefee);
	}

}
