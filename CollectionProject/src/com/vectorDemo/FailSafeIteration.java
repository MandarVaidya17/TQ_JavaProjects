package com.vectorDemo;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafeIteration {
	public static void main(String[] args) {
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(8);
		v1.add(6);
		v1.add(3);
		v1.add(-23);
		v1.add(43);
		
		System.out.println(v1);
		
		Enumeration<Integer> en=v1.elements();
		while(en.hasMoreElements()) {
			if(en.nextElement()==-23)
				v1.add(23);
		}
		System.out.println(v1);
	}

}
