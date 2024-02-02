package com.intermediate;

public class SecondMinArr {
	
	static int findSecondMin(int ar[]) {
		int min=Integer.MAX_VALUE;
		int scondMin=Integer.MAX_VALUE;
		
		for(int x:ar){
			if(x<min){
                scondMin=min;
                min=x;
            }else if(x<scondMin){
                scondMin = x;
            }
        }
		return scondMin;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,4,6,9,5};
		int sm=findSecondMin(arr);
		System.out.println(sm);
	}

}
