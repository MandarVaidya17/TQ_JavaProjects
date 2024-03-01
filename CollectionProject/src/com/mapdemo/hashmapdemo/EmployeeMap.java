package com.mapdemo.hashmapdemo;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class SalaryComarator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int) (o1.getSalary()-o2.getSalary());
	}

	
}

public class EmployeeMap {
	
	public static void main(String[] args) {
		HashMap<Employee, Department> hm=new HashMap<Employee, Department>();
		hm.put(new Employee(1, "Sagar", 14000), new Department(101, "IT", "Pune"));
		hm.put(new Employee(2, "Amar", 13000), new Department(102, "IT", "Mumbai"));
		hm.put(new Employee(3, "MAndar", 15000), new Department(105, "Sales", "Pune"));
		hm.put(new Employee(1, "Sagar", 14000), new Department(102, "Sales", "Mumbai"));

		for(Map.Entry<Employee, Department> e:hm.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("--------------------------------");
		}
		
		System.out.println("========================================");
		
		TreeMap<Employee, Department> tm=new TreeMap<Employee, Department>(new SalaryComarator());
		tm.putAll(hm);
		for(Map.Entry<Employee, Department> e :tm.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("--------------------------------");
		}
	}

}
