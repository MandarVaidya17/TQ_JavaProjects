package com.freq;

public class Frequency {
	
	static void findFreq(int ar[]) {
		int count;
		boolean status;
		
		for(int i=0;i<ar.length;i++) {
			count=1;
			status=false;
			
			for(int j=i-1;j>=0;j--) {
				if(ar[i]==ar[j]) {
					status=true;
					break;
				}
			}
			
			if(status==false) {
				for(int k=i+1;k<ar.length;k++) {
					if(ar[i]==ar[k]) {
						count++;
					}
					
				}
				//frequency
				System.out.println(ar[i]+" -->"+count);
				
				//duplicate
				if(count>1) {
					System.out.println("duplicate "+ar[i]);
				}
				//unique
				if(count==1) {
					System.out.println("unique "+ar[i]);
				}
			}
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {1,2,3,2,1,1,4,3};
			findFreq(arr);
	}

}
