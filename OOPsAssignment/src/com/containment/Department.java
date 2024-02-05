package com.containment;
//Create a class Department having did, deptName
//Create a class Employee having eid, empName, salary and department
//Create 3 objects
//  > 1.using anonymous department
//  > 2. using department object : using contsructor
//  > 3. using getter and setter: giving values from your own
//check the hashcode generated for department in 1st and 2 nd object
//Also print the details of all Employees
public class Department {

	private int did;
	private String deptName;
	
	public Department(){
		
	}
	public Department(int did,String deptName) {
		this.did=did;
		this.deptName=deptName;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String toString() {
		return "DeptId:"+did+" DeptName:"+deptName;
	}
	
}
