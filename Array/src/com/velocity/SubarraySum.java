package com.velocity;

public class SubarraySum {
	//WAP to add subarray with provided indexes
	public static void main(String[] args) {
		int arr[]= {1, 4, 20, 3, 10, 5};
		int x=2;
		int y=4;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i>=x&&i<=y) {
				sum=sum+arr[i];
			}
		}
		System.out.println("sun of subarray between "+x+" and "+y+" is=> "+sum);

	}

}
