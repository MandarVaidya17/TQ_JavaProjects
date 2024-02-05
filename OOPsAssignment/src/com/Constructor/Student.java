package com.Constructor;
class StudentData{
	private int rollno,sub1,sub2,sub3,sub4,sub5;
	private String name;
	double percentage,total,grade;
	
	public StudentData(int rollno,String name,int sub1,int sub2,int sub3,int sub4,int sub5) {
		this.rollno=rollno;
		this.name=name;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
		this.sub5=sub5;
		
	}
	public double calPercentage() {
		total=sub1+sub2+sub3+sub4+sub5;
		percentage=(total/500)*100;
		return percentage;
	}

	public void compareGrade(StudentData obj) {
		if(this.percentage>obj.percentage) {
			System.out.println(this.name+" has a greater marks than "+obj.name);
		}else {
			System.out.println(obj.name+" has a greater marks than "+this.name);
		}
		
	}
	
	
	public void displayStud() {
		System.out.println("RollNo:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Percentage:"+calPercentage());
		//System.out.println("Grade:"+compareGrade());
	}
	
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentData s1=new StudentData(1, "Sam", 90, 98, 87, 86, 76);
		StudentData s2=new StudentData(2, "Pablo", 76, 65, 98, 62, 93);
		s1.displayStud();
		s1.calPercentage();
		s2.displayStud();
		s2.calPercentage();
		s1.compareGrade(s2);
		
	}

}
