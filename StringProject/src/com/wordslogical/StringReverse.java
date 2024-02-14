package com.wordslogical;

public class StringReverse {
	static void findReverse(String st) {
		String revst="";
		for(int i=st.length()-1;i>=0;i--) {
			revst=revst+st.charAt(i);
		}
		System.out.println(revst);
	}
	
	static void findReverseWordbyeord(String st) {
		String s[]=st.split(" ");
		String revst="";
		for(int i=0;i<s.length;i++) {
			for(int j=s[i].length()-1;j>=0;j--) {
				revst=revst+s[i].charAt(j);
			}
			revst=revst+" ";
		}
		System.out.println(revst);
	}
	
	public static void main(String[] args) {
		String str="I like to learn java";
		System.out.println(str);
		findReverse(str);
		findReverseWordbyeord(str);
		
	}

}
