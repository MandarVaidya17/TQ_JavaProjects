package com.containment;

import java.util.Scanner;

public class EmployeeDetails {
	static Scanner sc=new Scanner(System.in);
	
	public static void setDeptDetails(Department d) {
	System.out.println("Enter DepID:");
	d.setDid(sc.nextInt());
	System.out.println("Enter DeptName");
	d.setDeptName(sc.next());
	}
	public static void setEmpDetails(Employee e) {
		System.out.println("Enter Employee Id:");
		e.setEid(sc.nextInt());
		System.out.println("Enter Employee Name:");
		e.setEmpName(sc.next());
		System.out.println("Enter Employee Salary:");
		e.setSalary(sc.nextDouble());
		System.out.println("Enter employee dept");
	//	e.setDepartment(d1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1=new Department(999,"Developer");
		Department d2=new Department(998,"Testing");
		Department d3=new Department(997,"HR");
		
		//EmployeeDetails x=new EmployeeDetails();
		//Department d1=new Department();
		
	//	x.setDeptDetails(d1);
	//	x.setEmpDetails(e1);
		Employee e1=new Employee(101,"pablo",2000,d1);
		System.out.println(e1);
		
	}

}
