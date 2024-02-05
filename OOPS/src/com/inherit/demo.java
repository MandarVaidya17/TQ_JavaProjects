package com.inherit;

import com.inheritance.Demo1;
//outside pkg without inheritance
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d=new Demo1();
		//d.show(); private
		//d.display();//default
		//d.print();//protected
		d.demo();
		
	//	d.a=90;private
	//	d.b=89;default
	//	d.c=88; protected 
		d.d=12;
		
	}

}
