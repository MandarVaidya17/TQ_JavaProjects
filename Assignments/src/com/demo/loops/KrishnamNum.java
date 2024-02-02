package com.demo.loops;

public class KrishnamNum {
	public static void krishnaNum() {
		int num=145,temp,rem,sum=0;
		temp=num;
		while(num>0) {
		int fact=1;
		rem=num%10;
		for(int i=1;i<=rem;i++) {
			
			fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
		}
		System.out.println(sum);
		if(sum==temp) {
			System.out.println("Krishnamurthi Num");
			
		}else
			System.out.println("NOt Krishnamurthi Number");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		krishnaNum();
	}

}
