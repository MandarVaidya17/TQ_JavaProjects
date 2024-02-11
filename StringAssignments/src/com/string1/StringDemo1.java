package com.string1;

import java.util.Arrays;

public class StringDemo1 {
	static void sortLength(String st[]) {
		for(int i=0;i<st.length;i++) {
			for(int j=0;j<st.length;j++) {
				if(st[i].length()<st[j].length()) {
					String temp=st[i];
					st[i]=st[j];
					st[j]=temp;
					}
			}
		}
	}
	static void sortLexo(String st[]) {
		for(int i=0;i<st.length;i++) {
			for(int j=i+1;j<st.length;j++) {
				if(st[i].compareTo(st[j])>0) {
				String temp=st[i];
				st[i]=st[j];
				st[j]=temp;
				}
			}
		}
	}
	static void commonEle(String s1[],String s2[]) {
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i].equals(s2[j])) {
					System.out.println(s1[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		String str1[]= {"One","Two","Three"};
		String str2[]= {"One","Three","Four"};
		sortLength(str2);
		System.out.println(Arrays.toString(str2));
		sortLexo(str2);
		System.out.println(Arrays.toString(str2));
		commonEle(str1, str2);
		
	
}
}
