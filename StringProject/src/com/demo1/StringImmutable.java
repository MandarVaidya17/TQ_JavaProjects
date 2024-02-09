package com.demo1;

public class StringImmutable {
		public static void main(String[] args) {
			String s1="java";
			
			s1.concat("Programs");//here new String is created in javaPrograms
			System.out.println(s1);
			String s2="java";
			s2=s2.concat("Programs");//here object is create in heap which is then stored in SCP
			System.out.println(s2);
			System.out.println(s2.hashCode());
			
			String s3="javaPrograms";
			System.out.println(s3.hashCode());
			
			System.out.println(s2==s3);
			System.out.println(s2.equals(s3));
		}
}		
