package com.velocity;

public class SubArraySum {

	public static void subArraySum(int[] arr, int s,int e) {
		int sum=0;
		for(int i=s;i<=e;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 4, 20, 3, 10, 5};
		subArraySum(arr, 2, 4);
	}

}
