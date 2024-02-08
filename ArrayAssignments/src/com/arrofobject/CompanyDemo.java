package com.arrofobject;

import java.util.Scanner;
public class CompanyDemo {
	static Scanner sc=new Scanner(System.in);
	static void enterUserInput(Employee e) {
		//	Student s=new Student();
			System.out.println("enter eid:");
			e.setEid(sc.nextInt());
			System.out.println("enter ename");
			e.setEname(sc.next());
			System.out.println("enter salary");
			e.setSalary(sc.nextDouble());
			System.out.println("Enter Department Info");
			e.setDept(new Department());
			System.out.println("enter did");
			e.getDept().setId(sc.nextInt());
			System.out.println("enter dname");
			e.getDept().setName(sc.next());
			System.out.println("Enter location:");
			e.getDept().setLocation(sc.next());
		}
		
		static void sortSalary(Employee emp[]) {
				Employee temp=new Employee();
				for(int i=0;i<emp.length;i++) {
					for(int j=i+1;j<emp.length;j++) {
						if(emp[i].getSalary()<emp[j].getSalary()) {
							temp=emp[i];
							emp[i]=emp[j];
							emp[j]=temp;
						}
					}
					
				}
				
			}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Department dept=new Department(101, "Developer", "Pune");
			
			Employee emp[]=new Employee[2];
//			emp[0]= new Employee(1, "Pablo", 35000, dept);
//			emp[1]= new Employee(2, "Mandar", 55000, new Department(102, "Manager", "Pune"));
//			emp[2]= new Employee(3, "Sanket", 45000, new Department(103, "Tester", "Mumbai"));
//			emp[3]=new Employee();
//			emp[3].setEid(4);
//			emp[3].setEname("Sid");
//			emp[3].setSalary(50000);
//			emp[3].setDept(dept);
			for(int i=0;i<emp.length;i++)
			{
				emp[i]= new Employee();
				enterUserInput(emp[i]);
			}
			sortSalary(emp);
			
			for(Employee e:emp) {
			System.out.println(e);
			}
			
	}

}
