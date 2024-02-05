package com.containment;

public class ambiguity {
	
		static void display(int a,double b) {
			System.out.println(a+b);
		}
		static void display(float a,int b) {
			System.out.println(a-b);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ambiguity a=new ambiguity();
		//a.display(1, 2);
		a.display(1f, 2);
	}

}
