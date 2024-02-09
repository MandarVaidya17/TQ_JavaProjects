package com.demo1;

public class CompareToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if two String content are exactly same -0
		//compares the unicode of characters
				String s1="Abha";
				String s2="Clay";
				
				System.out.println(s1.compareTo(s2));
				System.out.println(s2.compareTo(s1));
				
				String s3="Rahul";
				String s4="rahul";
				System.out.println(s3.compareTo(s4));
				System.out.println(s4.compareTo(s3));
	}

}
