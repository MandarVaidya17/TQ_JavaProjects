package com.stringLogical;

public class findNoChars {
	
	static int noChar(String s) {
		int count=0;
		char ch[]=s.toCharArray();
		for(char c:ch) {
			count++;
		}
		return count;
	}
	static void findVowelConsonanats(String s) {
		int vcount=0;
		int ccount=0;
		s=s.toUpperCase();
		char ch[]=s.toCharArray();
		for(char c:ch) {
			if(c==' ' | c=='.') {
				continue;
			}
			if(c=='A'|c=='I'|c=='E'|c=='O'|c=='U') {
				vcount++;
			}else
			{
				ccount++;
			}
		}
		System.out.println("no of vowels:"+vcount);
		System.out.println("no of consonant:"+ccount);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java is fun.";
		System.out.println("No of char:"+noChar(s1));
		findVowelConsonanats(s1);
		
	}

}
