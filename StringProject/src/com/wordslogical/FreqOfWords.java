package com.wordslogical;

public class FreqOfWords {
	
	static void findFreq(String st) {
		String s[]=st.split("\\s");
		int count;
		boolean status;
		
		for(int i=0;i<s.length;i++) {
			count=1;
			status=false;
			
			for(int j=i-1;j>=0;j--) {
				if(s[i].equalsIgnoreCase(s[j])) {
					status=true;
					break;
				}
			}
			
			if(!status) {
				for(int k=i+1;k<s.length;k++) {
							if(s[k].equalsIgnoreCase(s[i])) {
								count++;
					}
				}
				System.out.println(s[i]+" "+count);
			}
			
		}
	}
	
	public static void main(String[] args) {
		String str="A big a cat is rolling on a big mat";
		System.out.println(str);
		findFreq(str);
	}

}
