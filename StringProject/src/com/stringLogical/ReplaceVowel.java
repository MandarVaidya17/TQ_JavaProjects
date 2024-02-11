package com.stringLogical;
public class ReplaceVowel {
	
	static String vowelChnage(String s) {
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='A'|ch[i]=='I'|ch[i]=='E'|ch[i]=='O'|ch[i]=='U'||ch[i]=='a'|ch[i]=='i'|ch[i]=='e'|ch[i]=='o'|ch[i]=='u') {
				ch[i]='$';
			}
		}
		String s1=new String(ch);
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hello jaVA";
		s1=vowelChnage(s1);
		System.out.println(s1);
		 
		

	}

}
