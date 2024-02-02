package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class SquCubeArr {
	
	static void squArr(int ar[]) {
		int squ[]=new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			squ[i]=ar[i]*ar[i];
		}
		System.out.println(Arrays.toString(squ));
	}
	static void cubeArr(int ar[]) {
		int cube[]=new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			cube[i]=ar[i]*ar[i]*ar[i];
		}
		System.out.println(Arrays.toString(cube));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int arr[]= {2,3,4,5,6,7};
		
		System.out.println("Enter choise \n1.square\n2.cube");
		int choice =sc.nextInt();
		switch(choice){
		case 1:
			squArr(arr);
			break;
		case 2:
			cubeArr(arr);
			break;
		}
		
		sc.close();

	}

}
