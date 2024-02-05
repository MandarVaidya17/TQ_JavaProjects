package com.demo.constructor;

public class Student {

	private int studid;
	private String studname;
	private double studmarks;
	
	public Student(int studid,String studname,double studmarks) {
		this.studid=studid;
		this.studname=studname;
		this.studmarks=studmarks;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	public double getStudmarks() {
		return studmarks;
	}

	public void setStudmarks(double studmarks) {
		this.studmarks = studmarks;
	}
	public String toString() {
		return "studid=" + studid + ", studname=" + studname + ", studmarks=" + studmarks ;
	}
	
}
