package com.stringbufferbuilder;

public class CapacityDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		//sb.append("Hello");
		System.out.println(sb.capacity());
		
		StringBuilder sb1=new StringBuilder();
		System.out.println(sb1.capacity());
		
		StringBuffer sb2=new StringBuffer(5);
		sb2.append("java");
		System.out.println(sb2.capacity());
		
		sb2.append("SQL");
		System.out.println(sb2.capacity());//12
		//(oldcap*2)+2----(5*2)+2=12
	}
}
