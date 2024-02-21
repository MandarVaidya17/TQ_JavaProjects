package com.stackdemo;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stk=new Stack<String>();
		
		stk.push("Mandar");
		stk.add("Pooja");
		stk.push("Shreyash");
		
		System.out.println(stk);
		
		System.out.println(stk.peek());
		System.out.println(stk);
		
		System.out.println(stk.pop());
		System.out.println(stk);
		
		System.out.println(stk.search("Pooja"));
		System.out.println(stk.search("Harshit"));
		
	}

}
