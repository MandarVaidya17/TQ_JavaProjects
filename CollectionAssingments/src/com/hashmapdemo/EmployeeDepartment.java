package com.hashmapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmployeeDepartment {
	
	static void mapDemo(ArrayList<Employee> em) {
		HashMap<Integer, ArrayList<Employee>> hm=new HashMap<Integer, ArrayList<Employee>>();
		ArrayList<Employee> list;
		
		for(Employee e:em) {
			
			if(hm.containsKey(e.getDept().getDid())) {
				list=hm.get(e.getDept().getDid());
				list.add(e);
				hm.put(e.getDept().getDid(), list);
			}
			else
			{
				list=new ArrayList<Employee>();
				list.add(e);
				hm.put(e.getDept().getDid(), list);
			}
		}
		
		for(Map.Entry<Integer, ArrayList<Employee>> e: hm.entrySet()) {
			int count=0;
			for(Employee s:e.getValue()) {
				System.out.println(s.getId()+" "+s.getName()+" "+s.getSalary());
				count++;
			}
			System.out.println("Dept ID:"+e.getKey()+" :"+count);
			System.out.println("---------------------------------------------");
		}
	}
	
	static void showSalarydetails(ArrayList<Employee> emp) {
		HashMap<Department, Double> hm=new HashMap<>();
		
		Iterator<Employee> itr=emp.iterator();
		while(itr.hasNext()) {
			double salary=0.0;
			Employee e=itr.next();
			Double sal=e.getSalary();
			Department d=e.getDept();
			if(hm.containsKey(d)) {
				salary=hm.get(d);
				hm.put(d, salary+sal);
			}
			else
			{
				hm.put(d, sal);
			}
		}
		for(Map.Entry<Department, Double> e:hm.entrySet()) {
			System.out.println(e.getKey()+" :"+e.getValue());
			
		}
		
		
	}
	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<Employee>();
		
		emp.add(new Employee(101, "Amar", 45000, new Department(99, "IT")));
		emp.add(new Employee(102, "Sagar", 55000, new Department(98, "HR")));
		emp.add(new Employee(103, "Sandesh", 48000, new Department(97, "Finance")));
		emp.add(new Employee(104, "Mandar", 32000, new Department(99, "IT")));
		emp.add(new Employee(105, "Rushi", 67000, new Department(98, "HR")));
		
		for(Employee e:emp) {
			System.out.println(e);
		}
		System.out.println("--------------------------------------------");
		//mapDemo(emp);
		showSalarydetails(emp);
		
	}

}
