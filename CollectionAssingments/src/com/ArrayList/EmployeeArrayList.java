package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getSalary()==e2.getSalary())
			return e1.getName().compareTo(e2.getName());
		else
		return (int) (e1.getSalary()-e2.getSalary());
	}
	
}

public class EmployeeArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(101, "Pablo", 60000));
		emp.add(new Employee(102,"Pradnya",45000));
		emp.add(new Employee(103,"Mandar",55000));
		emp.add(new Employee(104,"Amar",42000));
		
		Iterator<Employee> itr=emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------------");

		System.out.println(emp.toString());
		//sorting
		//Collections.sort(emp, new SalaryComparator());
		for(Employee e:emp) {
			System.out.println(e);
		}
		System.out.println("---------------------------");
		for(Employee e:emp) {
			if(e.getSalary()>45000) {
				System.out.println(e);
			}
		}
		System.out.println("---------------------------");
		for(Employee e:emp) {
			if(e.getName()=="Pablo") {
				System.out.println(e);
			}
		}
		System.out.println("---------------------------");
		//Copy Arralist
		ArrayList<Employee> emp2=new ArrayList<Employee>();
		for(Employee e:emp) {
			emp2.add(e);
		}
		for(Employee e:emp2) {
			System.out.println(e);
		}
		//compare
		if(emp.equals(emp2))
			System.out.println("Equal arralists");
		else
			System.out.println("Not equal arraylist");
		
		//add 2 arraylist
		emp.addAll(emp2);
		
		System.out.println("---------------------------");
		
		System.out.println(emp);
		System.out.println("---------------------------");

		Collections.reverse(emp2);
		for(Employee e:emp2) {
			System.out.println(e);
		}

		Collections.shuffle(emp2);
		System.out.println("---------------------------");
		for(Employee e:emp2) {
			System.out.println(e);
		}
		System.out.println("---------------------------");
		ArrayList<Integer> al=new ArrayList<Integer>(2);
		al.add(2);
		al.add(4);
		al.add(5);
		
		System.out.println(al.size());
		emp2.trimToSize();
		System.out.println(al.size());
		
		
		
		
	}

}
