package com.basic;

public class SumPrimeArr {
	public static boolean isPrime(int number) {
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
		// TODO Auto-generated method stub
		 int arr[]= {3,4,7,9,8,11,19};
		 int sum=0;
		 for(int i=0;i<arr.length;i++) {
			 if(isPrime(arr[i])){
				 sum=sum+arr[i];
			 } 
	}
		 System.out.println(sum);

}
}
