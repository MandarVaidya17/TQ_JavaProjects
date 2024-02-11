package com.string1;

import java.util.Arrays;

public class OccurenceDemo {
	
	static void firstOccurrence(String str,char target) {
		 for (int i=0;i<str.length(); i++) {
	            if (str.charAt(i) == target) {
	            	System.out.println(target+" first occurrence positon is:"+i);
	            	break;
	            }
	       }
	}
	static void middelOccurrence(String str,char target) {
		int count=0;
		 for (int i=0;i<str.length();i++) {
	            if (str.charAt(i) == target) {
	            	count++;
	            	if(count==2) {
	            	System.out.println(target+" first occurrence positon is:"+i);
	            	break;
	            	}
	            }
	       }
	}
	
	static void countOccurrence(String str,char target) {
		int count=0;
		for (int i=0;i<str.length(); i++) {
            if (str.charAt(i) == target) {
            	count++;
            }
       }
		System.out.println(target+"target Count:"+count);
	}
	
	static void removeSpace(String str) {
		str=str.replace(" ", "");
		System.out.println(str);
		
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(")==" ") {
//				
//			}
//		}
	}
	
	
	static void countAllOccurrence(String str) {
		System.out.println("Count all occurence/frequency inString");
		for (int i=0;i< str.length(); i++) {
			int count=0;
			for(int j=0;j<str.length();j++)
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
			
			System.out.println(str.charAt(i)+" Count:"+count);
			
            }
       }
	static void duplicateChar(String str) {
		System.out.println("Duplicate Characters in String");
		for (int i=0;i< str.length(); i++) {
			for(int j=i+1;j<str.length();j++)
                if (str.charAt(i) == str.charAt(j)) {
                	System.out.println(str.charAt(i)+"--->"+str.charAt(j));  
                	break;
                }
            }
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="gojosaturo";
		String str2="Dhananjay";
		String str3="PabloEscobar";
		firstOccurrence(str, 'o');
		middelOccurrence(str2, 'a');
		countOccurrence(str2, 'a');
		countAllOccurrence(str2);
		duplicateChar(str3);
		String str4="java Main class";
		removeSpace(str4);


	}

}
