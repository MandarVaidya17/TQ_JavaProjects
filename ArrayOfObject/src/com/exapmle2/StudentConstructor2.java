package com.exapmle2;

public class StudentConstructor2 {
	
	static void countStudentCourseWise(Student st[],Course ct[]) {
		int count;
		for(Course c:ct) {
			count=0;
			for(Student s:st) {
				if(s.getCourse().equals(c)) {
					count++;
				}
			}
			System.out.println(c+" ->"+count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Course ct[]=new Course[3];
			ct[0]=new Course(1,"java");
			ct[1]=new Course(2,".net");
			ct[2]=new Course(3,"Python");
			
			Student stud[]=new Student[4];
			stud[0]=new Student(101,"Amar",new double[] {45,67,54},ct[1]);
			stud[1]=new Student(102,"Samar",new double[] {45,67,54},ct[0]);
			stud[3]=new Student(102,"Samar",new double[] {45,67,54},ct[0]);

			stud[2]=new Student();
			stud[2].setSid(103);
			stud[2].setSname("Pablo");
			stud[2].setMarks(new double[] {65,76,88});
			stud[2].setCourse(ct[2]);
			for(Student s:stud) {
				System.out.println(s);
			}
			countStudentCourseWise(stud, ct);
	}

}
