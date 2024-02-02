package com.demo.loops;

public class FrequencyNum {
	
	public static void freqNum() {
		int i,num=125341211,temp;
		for(i=0;i<=9;i++) {
			temp=num;
			int count=0;
			int rem = 0;
			while(temp>0) {
				rem=temp%10;
				if(rem==i) {
					count++;
				}
				temp=temp/10;
			}
			if(count>0) {
			System.out.println(i+" ----> "+count);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		freqNum();
	}

}
