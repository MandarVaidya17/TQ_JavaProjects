package com.stringLogical;

import java.util.Arrays;

public class Anagram {
	
	static  void sortArray(char ch[]) {
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
	}
	
	static boolean checkAnagram(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;
		else {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		sortArray(ch1);
		sortArray(ch2);
		
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=ch2[i]) {
				return false;
			}
		}
		return true;
		}
	}
	
	static boolean checkAnagram2(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;
		else {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		System.out.println(s1+"\n"+s2);
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(ch1);
		System.out.println(ch2);
		
		if(Arrays.equals(ch1, ch2))
			return true;
		else
			return false;
	}
}
	public static void main(String[] args) {
		String s1="race";
		String s2="aceR";
		System.out.println(s1);
		System.out.println(s2);
		
		if(checkAnagram2(s1, s2))
			System.out.println("String is anagram");
		else
			System.out.println("not anagram");
	}

}
