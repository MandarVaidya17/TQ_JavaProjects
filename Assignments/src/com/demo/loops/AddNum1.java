package com.demo.loops;

public class AddNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num1=0,num2=1,num3;
		
		System.out.println(num2);
		for(i=0;i<=8;i++) {
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
	}

}
