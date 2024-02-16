package com.worldlogical;

import java.util.Arrays;

//WAP to split string into 2 tokens where string is “HELLO$WORLD”
public class SplitDemo {
	public static void main(String[] args) {
		String str="HELLO$WORLD";
		String[] s=str.split("\\$");
		System.out.println(Arrays.toString(s));
		for(String i:s) {
			System.out.print(i+" ");
		}
	}

}
