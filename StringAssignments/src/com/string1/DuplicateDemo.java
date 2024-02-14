package com.string1;
// WAP to find the duplicate and unique words in a string
public class DuplicateDemo {
	
	static void dupliString(String st) {
		String s[]=st.split(" ");
		int count;
		for(int i=0;i<s.length;i++) {
			count=0;
			for(int j=i+1;j<s.length;j++) {
				if(s[i].equals(s[j])) {
					count++;
					//System.out.println(count);
					//System.out.println("Duplicate words:"+s[i]);
				}
			}
			if(count==1) {
				//System.out.println(s[i]);
			}else if(count==0) {
				System.out.println(s[i]);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		String str="I am Strong and also I am Smart";
		dupliString(str);
	}

}
