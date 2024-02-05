package com.demo.classobject;

class Employee{
	int eid=101;
	String ename="Pablo";
	double esal=70000;
	
	public void setdetails() {
		eid=102;
		ename="sunny";
		esal=55000;
	}
	public void showDetails() {
		System.out.println("employee id:"+eid);
		System.out.println("employee name:"+ename);
		System.out.println("employee salary"+esal);
		System.out.println("----------------------");
	}
}

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		e1.showDetails();
		e2.showDetails();
		
		e3.setdetails();
		e3.showDetails();
	}

}
