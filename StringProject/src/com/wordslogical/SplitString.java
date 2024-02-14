package com.wordslogical;

import java.util.Arrays;

public class SplitString {
	
	static void divideString(String s,int noOfc) {
		int len=s.length();
		int ns=len/noOfc;
		if(len%noOfc!=0) {
			System.out.println("Cannot divide in equal parts..");
		}
		else {
			String splStr[]=new String[ns];
			int index=0;
			for(int i=0;i<s.length();i=i+noOfc) {
				splStr[index]=s.substring(i,i+noOfc);
				index++;
			}
			System.out.println(Arrays.toString(splStr));
		}
	}
	static void divideStringAssHash(String s,int noOfc) {
		
		int len=s.length();
		
		if(len%noOfc!=0) {
			int x=noOfc-(len%noOfc);
			for(int i=0;i<x;i++) {
				s=s+"#";
			}
		}
			len=s.length();
			int ns=len/noOfc;
			String splStr[]=new String[ns];
			int index=0;
			for(int i=0;i<s.length();i=i+noOfc) {
				splStr[index]=s.substring(i,i+noOfc);
				index++;
			}
			System.out.println(Arrays.toString(splStr));
		
	}
	
			
	public static void main(String[] args) {
		String arr[]= {"I","am","very","smart"};
		System.out.println(Arrays.toString(arr));
		String st=String.join("", arr);
		
		int noOfChars=5;
		//divideString(st, noOfChars);
		divideStringAssHash(st, noOfChars);
	}

}
