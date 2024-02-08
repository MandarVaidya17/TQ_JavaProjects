package com.varags;

import java.lang.reflect.Method;

public class RulesOfVarags {
	//rule 1: only one varags in method
//	static void display(int ...a1,int ...a2) {
//		
//	}
	
	
// rule 2: varags has to be last in the method
//	static void math1(int n1,int ...a1,int n2) {
//		
//	}\
	
	static void math1(int n1,int n2,int ...a1) {
		System.out.println(n1);
		System.out.println(n2);
		for(int x:a1) {
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		math1(2, 3, 4,5,6,7);

	}

}
