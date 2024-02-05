package com.demo.loop;

public class ArmstrongNumRange {
	
	public static int countDigit(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		return count;
	}
	
	public static int findPower(int base,int pow) {
		int i;
		int p=1;
		for(i=1;i<=pow;i++) {
			p*=base;
		}
		return p;
	}
	
	public static boolean isArmstrong(int num) {
		int pow=countDigit(num);
		int original=num;
		int rem,sum=0;
		while(num!=0) {
			rem=num%10;
			sum=sum+findPower(rem, pow);
			num/=10;
		}
		return original==sum;
	}
	
	public static void Armstrong()
	{
		int i;
		for(i=1;i<=10000;i++) {
			if(isArmstrong(i))
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong();
	}

}
