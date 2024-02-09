package com.arrofobject;
//Create a class Student having id,name, array of marks 
//and percentage
//Create a method to calculate percentage
//from the marks
//Create 5 object of this class anonymously.
//Display the student details containing id,name and percentage

import java.util.Arrays;

public class Student {
		int id;
		String sname;
		double marks[]=new double[3];
		
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int id, String sname, double[] marks) {
			super();
			this.id = id;
			this.sname = sname;
			this.marks = marks;
			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public double[] getMarks() {
			return marks;
		}
		public void setMarks(double[] marks) {
			this.marks = marks;
		}
		public void percentage() {
			double sum=0;
			double percentage = 0;
			for(int i=0;i<marks.length;i++) {
				sum=sum+marks[i];
				percentage=(sum)/marks.length;
				
			}
			System.out.println(percentage);
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", sname=" + sname + ", marks=" + Arrays.toString(marks) + "]";
		}
		
		
		
}
