package com.L1;

public class SubArray {
//Find Subarray with given sum 
	public static void main(String[] args) {
		int a[] = {1,8,9,3,5,4,7,2,6};
	//sum from index 2 to 5.	
		int b=2;
		int c=5;
		int sum =0;
		for(int i=b; i<=c; i++) {
			sum = sum +a[i];
		}
		System.out.println("sum of given subArray>>"+sum);


	}

}
