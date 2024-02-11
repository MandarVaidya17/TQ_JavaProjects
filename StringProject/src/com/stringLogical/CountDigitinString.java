package com.stringLogical;

public class CountDigitinString {
	
	static int findCount(String s) {
		int count=0;
		char ch[]=s.toCharArray();
		for(char c:ch) {
			if(c>=48 && c<=57) {
				count++;
			}
		}
		return count;
	}
	static int findCount2(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) 
		{
			if(Character.isDigit(s.charAt(i)))
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java123pro456gram90";
		System.out.println(s1);
		System.out.println(findCount2(s1));
	}

}
