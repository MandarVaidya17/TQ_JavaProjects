package com.wordslogical;

import java.util.Arrays;

public class SplitDemo {
	public static void main(String[] args) {
		String str="I like to learn java";
		
		String[] s=str.split("to");
		System.out.println(Arrays.toString(s));
	}

}
