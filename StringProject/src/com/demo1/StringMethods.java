package com.demo1;

public class StringMethods {
		public static void main(String[] args) {
			String  str="java is fun";
			System.out.println(str.length());//11
			
			//charAt
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(str.length()-1));
			//concat,+
			String s1="Hello";
			String s2="World";
			//2 different object will be created Helloworld in heap only
			System.out.println(s1+s2);
			System.out.println(s1.concat(s2));
			
			//subString
			System.out.println(str.contains("ava"));
			System.out.println(str.contains("orl"));
			
			String w1="hi";
			String w2="Hi";
			
			System.out.println(w1==w2);
			System.out.println(w1.equals(w2));
			
			System.out.println(w1.equalsIgnoreCase(w2));
			
			//upper case
			System.out.println(str.toLowerCase());
			System.out.println(str.toUpperCase());
			//indexOf,lastIndexOf
			System.out.println(str.indexOf('a'));
			System.out.println(str.lastIndexOf('a'));
			System.out.println(str.indexOf("fun"));
			
			//isEmpty
			String str1="  ";
			System.out.println(str1.isBlank());//true
			System.out.println(str1.isEmpty());//false
			
			//trim
			
			String st=" java  main  ";
			System.out.println(st+st.length());
			
			st=st.trim();
			System.out.println(st+st.length());
			
			System.out.println(st.replace('a', 'z'));
			System.out.println(st);
		}
}
