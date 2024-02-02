package com.conditionaloperator;

public class SalaryGross {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary=21000;
		float gs,hra=0,da=0;
		if(salary<=10000) {
			hra=0.2f*salary;
			da=0.8f*salary;
			
			
		}else if(salary<=20000) {
			hra=0.25f*salary;
			da=0.9f*salary;
			
		}else if(salary>20000) {
			hra=0.30f*salary;
			da=0.95f*salary;
			
		}	
		gs=salary+hra+da;
		System.out.println("Gross Salary is.."+gs);
	}

}
