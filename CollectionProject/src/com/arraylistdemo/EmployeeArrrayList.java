package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrrayList {
	public static void main(String[] args) {
		ArrayList<Employee> elist=new ArrayList<Employee>();
		elist.add(new Employee(101, "Pablo", 90000));
		elist.add(new Employee(104, "Mandar", 50000));
		elist.add(new Employee(102, "Rushi", 45000));
		elist.add(new Employee(106, "Pradnya", 33000));
		elist.add(new Employee(103, "Amruta", 33000));
		elist.add(new Employee(105, "Amar", 65000));
		
		for(Employee e:elist) {
			System.out.println(e);
		}
		
		System.out.println("----------------");
		
		//Collections.sort(elist, new EmployeeNameComaparator());
		Collections.sort(elist, Collections.reverseOrder(new EmployeeNameComaparator()));
		for(Employee e:elist) {
			System.out.println(e);
		}
	}

}
