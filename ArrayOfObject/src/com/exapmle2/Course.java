package com.exapmle2;

public class Course {
	int id;
	String cname;
	public Course(int id, String cname) {
		super();
		this.id = id;
		this.cname = cname;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", cname=" + cname + "]";
	}
	
	
}
