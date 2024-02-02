package com.intermediate;

import java.util.Arrays;

public class PrimeNumArr {
	public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <=number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		int arr[]= {3,6,7,9,11,17,19,44};
		int sum=0;
		for(int x:arr) {
			if(checkPrime(x)) {
				sum=sum+x;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
		

	}

}
