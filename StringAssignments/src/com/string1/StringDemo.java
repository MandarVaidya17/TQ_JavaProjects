package com.string1;

public class StringDemo {
	
	static void removeString(String str) {
		char ch[]= new char[str.length()];
		int k=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<=str.length()-1;j++) {
				if(str.charAt(i)!=str.charAt(j) ){
				ch[k]=str.charAt(i);
				System.out.println(str.charAt(i));
				k++;
				}
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		String str="zablo";
		//removeString(str);
		String str1="pablo";
		
		System.out.println(str.compareTo(str1));
		
		for(int i=0;i<str.length();i++) {
			//System.out.println(str.charAt(i));
		}
		
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.charAt(0)==str1.charAt(0));
		
	}

}
