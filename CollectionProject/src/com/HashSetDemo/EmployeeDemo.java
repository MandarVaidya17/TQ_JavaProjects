package com.HashSetDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmployeeDemo {
	
	public static void main(String[] args) {
		LinkedHashSet<Employee> lhs=new LinkedHashSet<Employee>();
		
		lhs.add(new Employee(101, "Sagar", 23000));
		lhs.add(new Employee(102, "Rushi", 54000));
		lhs.add(new Employee(104, "Harshit", 45000));
		lhs.add(new Employee(103, "Anita", 33000));
		lhs.add(new Employee(101, "Sagar", 23000));
		lhs.add(new Employee(0, null, 0));
		
		System.out.println(lhs);
		
		Iterator<Employee> itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
