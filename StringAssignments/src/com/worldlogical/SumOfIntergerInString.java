package com.worldlogical;

public class SumOfIntergerInString {
	static void findSum(String s)
		{
		int sum=0;
		char ar[]=s.toCharArray();
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>=48 &&ar[i]<=57) {
				int j=ar[i]-48;
				sum=sum+j;
			}
		}
		System.out.println(sum);
		}
	
	static void findSum1(String s)
	{
	int sum=0;
	char ar[]=s.toCharArray();
	for(int i=0;i<ar.length;i++)
	{
		if(Character.isDigit(ar[i])) {
			int j=Character.getNumericValue(ar[i]);
			sum=sum+j;
		}
	}
	System.out.println(sum);
	}
	static void findAvarage(String s)
	{
	int sum=0,count=0;
	char ar[]=s.toCharArray();
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]>=48 &&ar[i]<=57) {
			int j=ar[i]-48;
			sum=sum+j;
			count++;
		}
	}
	int avg=sum/count;
	System.out.println(avg);
	}
	public static void main(String[] args) {
			String str="you got 234 marks in JEE";
			findSum(str);
			findSum1(str);
			findAvarage(str);
		}
}
