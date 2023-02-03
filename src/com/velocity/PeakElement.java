package com.velocity;

public class PeakElement {
	//Find a peak element which is not smaller than its neighbours

	public static int getPeakElement(int[] arr, int n) {
		if (n == 1) // for array which has only one element
			return 0;

		if (arr[0] > arr[1]) // for 1st element is greater than 2nd
			return arr[0];

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) // for all other array element
				return arr[i];
		}
		if (arr[n - 1] > arr[n - 2]) // for condition where only last element is
			// surrounded by smaller number as in a given array
			return arr[n - 1];
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		int element = getPeakElement(arr, n);
		System.out.println(element);

	}

}
