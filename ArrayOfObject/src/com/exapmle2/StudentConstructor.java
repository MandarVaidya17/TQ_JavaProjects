package com.exapmle2;

public class StudentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stud[]=new Student[4];
		
		stud[0]=new Student(101,"Amar",new double[] {45,67,54},new Course(1,"java"));
		stud[1]=new Student(102,"Samar",new double[] {45,67,54},new Course(1,"java"));
		stud[3]=new Student(103,"Samar",new double[] {45,67,54},new Course(1,"java"));

		stud[2]=new Student();
		stud[2].setSid(103);
		stud[2].setSname("Pablo");
		stud[2].setMarks(new double[] {65,76,88});
		stud[2].setCourse(new Course(2,".net"));
		
		for(Student s:stud) {
			System.out.println(s);
		}
		stud[0].getCourse().setCname("Fullstack");
		System.out.println("-----------------");
		
		for(Student s:stud) {
			System.out.println(s);
		}
	}

}
