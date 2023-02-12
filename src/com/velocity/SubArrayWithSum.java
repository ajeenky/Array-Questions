package com.velocity;

public class SubArrayWithSum {

	public static void subArraySum(int[] arr, int s,int e) {
		int sum=0;
		for(int i=s;i<=e;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of SubArray : "+sum);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 4, 20, 3, 10, 5};
		subArraySum(arr, 1, 4);
		
	}
}
