package com.velocity;

public class MaxAndMinNumInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int n=arr.length;
		int min=arr[0];
		int max=arr[1];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum number in an array is>> "+max);
		System.out.println("Minimum number in an array ia>>"+min);
	

	}

}
