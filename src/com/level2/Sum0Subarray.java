package com.level2;

public class Sum0Subarray {
//Find if there is a subarray with 0 sum
//	Input: {4, 2, -3, 1, 6}
//	Output: true 
//	Explanation:
//	There is a subarray with zero sum from index 1 to 3.
	public static void main(String[] args) {

		int[] arr = { 4, 2, -3, 1, 6 };

		System.out.println(isSubSumZero(arr));
	}

	public static Boolean isSubSumZero(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[0] == 0) {
				return true;
			}
			int sum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				sum = sum + arr[j];
				if (sum == 0) {
					return true;
				}
			}

		}

		return false;

	}

}
