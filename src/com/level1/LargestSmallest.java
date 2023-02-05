package com.level1;

// Find the kth largest and kth smallest number in an array
public class LargestSmallest {
	// make array as static so it can access in both for loop
	static int[] a = { 4, 7, 3, 8, 5, 0, 1 };

	// Created method
	public static void getLargest(int k) {
		// int[] a = { 4, 7, 3, 8, 5, 0, 1 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				// check condition
				if (a[i] > a[j]) {
					// Swapping without third variable
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
		}
		System.out.println("largest " + a[a.length - k]);
	}

	public static void getSmallest(int k) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				// check condition
				if (a[i] < a[j]) {
					// Swapping without third variable
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
		}
		System.out.println("Smallest " + a[a.length - k]);
	}

	public static void main(String[] args) {
		// call method
		getLargest(3);
		getSmallest(3);
	}
}
