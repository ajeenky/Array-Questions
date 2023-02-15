package com.velocity;

import java.util.Arrays;

public class KthLargestandSmallest {

	public static void kthLargest() {
		int[] arr = { 5, 19, 6, 31, 8, 24 };
		int k = 2;
		// Sort the Array
		Arrays.sort(arr);
		System.out.println("Kth Largest no. is => " + arr[arr.length - k]);

	}

	public static void kthSmallest() {
		int[] arr = { 5, 19, 6, 31, 8, 24 };
		int k = 3;
		// Sort the Array
		Arrays.sort(arr);
		System.out.println("Kth Smallest no. is => " + arr[k - 1]);

	}

	public static void main(String[] args) {
		kthLargest();
		kthSmallest();

	}

}
