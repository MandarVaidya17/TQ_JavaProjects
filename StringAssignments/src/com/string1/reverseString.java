package com.string1;

public class reverseString {
	static void revrseString(String str) {
		char temp[]=new char[str.length()];
		int j=0;
		for(int i=str.length()-1;i>=0;i-- ){
				temp[j]=str.charAt(i);
				j++;
		}
		str=new String(temp);
		System.out.println(str);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="PAblo";
			revrseString(str);
	}

}
