package com.L1;

public class Que8 {

	public static void main(String[] args) {
		// Subarray with given Sum
		
		int arr [] = {1,2,3,3,4,2,6,5,7,8,9,1};
		
		int sum = 19;
		int count = 0;
		int from = 0;
		int to = 0;
		
		if (sum == arr[0]) {
			System.out.println("Given sum is present at index 0");
			count++;
		} else {
			for (int i = 0; i < arr.length; i++) {
				int temp = arr[i];
				for (int j = i + 1; j < arr.length; j++) {
					temp = temp + arr[j];
					if (temp == sum) {
						System.out.println("Given sum found between elements "+i+" to "+j);
						count++;
					}
				}
				if (count != 0) {
					break;
				}
			}
		}
		if(count == 0) {
			System.out.println("SubArray is not present of "+sum);
		}
	}

}
