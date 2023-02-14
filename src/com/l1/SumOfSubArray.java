package com.l1;

public class SumOfSubArray {

	public static void main(String[] args) {
		// Find Subarray with given sum 
		
		int a[] = {1, 4, 20, 3, 10, 5};
     	int begin = 2;
	    int end = 4;
		int sum=0;
		for(int i=begin; i<=end ; i++) {   //It  takes 20,3,10
		
			     sum=sum+a[i];            //Display its sum.
			}
		System.out.println(sum);
	}

}
