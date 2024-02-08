package com.arrofobject;
//Create a class Department id, name, location
//Create a class Employee having id,name and salary
//and containment dept
//--> Create 2 anonymous object and one object from
//getter,setter
//----> Create object using user input
//---> Sort the employee on the basis of salary
//--->Find the employee having max salary

public class Department {
	int id;
	String name,location;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	
	

}
