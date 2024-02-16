package com.worldlogical;

public class StringCapital1stL {
	public static void main(String[] args) {
		String str="agasti college akole";
		String s[]=str.split(" ");
		String s1 = null;
		for(int i=0;i<s.length;i++) {
			char c[]=s[i].toCharArray();
			for(int j=0;j<c.length;j++) {
				
				c[0]=Character.toUpperCase(c[0]);
				s1=new String(c);
			}
			s[i]=s1;
		}
		str=String.join(" ", s);
		System.out.println(str);
	}

}
