package com.wordslogical;

public class MostRepeatedWord {
	
	static void repeatWord(String st) {
		String s[]=st.split(" ");
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].equals(s[j])) {
					System.out.println(s[i]);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		String s="I am Smart aslo I am strong";
		repeatWord(s);
	}

}
