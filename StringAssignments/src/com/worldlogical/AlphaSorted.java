package com.worldlogical;

public class AlphaSorted {
	static void checkString(String st) {
		String s[]=st.split(" ");
		
		for(int i=0;i<s.length;i++) {
			char c[]=s[i].toCharArray();
			if(c.length>3) {
				int count=0;
			for(int j=0;j<c.length;j++) {
				
				for(int k=j+1;k<c.length;k++)
					if(c[j]>c[k]) {
						//System.out.println(s[i]);
						count++;
						break;
					}
//				System.out.println(count);
//				System.out.println(s[i].length());
				}
			
			if(count==0) {
				System.out.println(s[i]);
				System.out.println("true");
				break;
			}else if(s[i].length()-1==count) {
				System.out.println("false");
			}
			
			}
			
		}
	}
	public static void main(String[] args) {
		String s1="Paula has a French accent .";
		String s2="The biopsy returned negative results .";
		String s3="She sells sea shells by the sea shore .";
		checkString(s1);
	}

}
