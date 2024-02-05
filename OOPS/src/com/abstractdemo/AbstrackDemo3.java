package com.abstractdemo;
abstract class EmpAbs{
	int compId;
	static String compName="TCS";
	
	public EmpAbs() {
		// TODO Auto-generated constructor stub
	}
	public EmpAbs(int compId) {
		//this().
	}
	
	abstract void empData();
	
	void empCompany() {
		System.out.println("Company name:");
	}
}
class Employee extends EmpAbs{
	

	@Override
	void empData() {
		System.out.println("Employee id:101");	
		System.out.println("Employee Name:Pablo");
	}
	
}
public class AbstrackDemo3 {

	public static void main(String[] args) {
		EmpAbs a1;
		a1=new Employee();
		a1.empCompany();
		a1.empData();
		
		
	}

}
