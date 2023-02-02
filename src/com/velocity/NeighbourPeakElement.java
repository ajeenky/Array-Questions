package com.velocity;

public class NeighbourPeakElement {

	public static int findPeak(int[] arr, int n) {
		int l = arr.length;
		int temp = 0;

		if (l == 1) {
			return 0;
		} else if (arr[0] > arr[1]) {
			return 0;
		} else if (arr[l - 1] > arr[l - 2]) {
			return l - 1;
		}

		for (int i = 0; i < l - 1; i++) {
			if (arr[i + 1] >= arr[i] && arr[i + 1] > arr[i + 2]) {
				return i + 1;
			}
		}

		return temp;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 20, 4, 8, 0 };
		int n = arr.length;
		System.out.print("Index of a peak point is " + findPeak(arr, n));
	}

}
