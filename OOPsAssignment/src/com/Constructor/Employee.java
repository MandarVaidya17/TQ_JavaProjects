package com.Constructor;

class SalaryCal{
	private int id,basicsal;
	private String ename,depname;
	double hra,da,pf,netsal;
	
	public SalaryCal() {
		id=102;
		basicsal=15000;
		ename="Pablo";
		depname="Devloper";
		
	}
	
	SalaryCal(int id,String ename,int basicsal,String depname) {
		this.id=id;
		this.ename=ename;
		this.basicsal=basicsal;
		this.depname=depname;
		
	}
	public void calculateSal() {
		hra=basicsal*0.15;
		System.out.println("HRA:"+hra);
		da=basicsal*0.20;
		System.out.println("DA:"+da);
		pf=basicsal*0.10;
		System.out.println("PF:"+pf);
		netsal=basicsal-pf+da+hra;
		System.out.println("NetSal:"+netsal);
	}
	public void displayEmp() {
		System.out.println("Id:"+id);
		System.out.println("Name:"+ename);
		System.out.println("BasicSal:"+basicsal);
		System.out.println("DepName:"+depname);

	}
}

public class Employee {
	public static void main(String[] args) {
		SalaryCal s1=new SalaryCal();
		s1.displayEmp();
		SalaryCal s2=new SalaryCal(101,"Mandar",16000,"HR");
		s2.displayEmp();
		s2.calculateSal();
	}

}
