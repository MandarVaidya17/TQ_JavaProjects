package com.stringLogical;

public class StringIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		String s2="java";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3=new String("java");
		s3=s3.intern();
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		String str1="java";
		str1=str1.concat("program");
		
		String str2="javaprogram";
		
		str1=str1.intern();
		System.out.println(str1==str2);
		
		
		
	}

}
