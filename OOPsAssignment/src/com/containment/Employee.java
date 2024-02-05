package com.containment;
//Create a class Employee having eid, empName, salary and department

public class Employee {
		private int eid;
		private String empName;
		private double salary;
		private Department department;
		
		public Employee() {
			
		}
		public Employee(int eid,String empName,double salary,Department department) {
			this.eid=eid;
			this.empName=empName;
			this.salary=salary;
			this.department=department;
		}
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Department getDepartment() {
			return department;
		}
		public void setDepartment(Department department) {
			this.department = department;
		}
		public String toString() {
			return "EmpID:"+eid+" EmpName:"+empName+" Salary:"+salary+" DeptDetails:"+department;
		}
}
