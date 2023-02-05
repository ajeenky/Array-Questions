package com.L1;

public class Que8 {

	public static void main(String[] args) {
		// Subarray with given Sum
		
		int arr [] = {1,2,3,3,4,2,6,5,7,8,9,1};
		
		int from = 2;
		int to = 5;
		int sum = 0;
		for (int i = 0; i < arr.length; i ++) {
			if (i >= from && i <= to) {
				sum = sum + arr[i];
			}
		}
		
		System.out.println("Sum of sub array--> "+sum);
	}

}
