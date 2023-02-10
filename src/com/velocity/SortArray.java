package com.velocity;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 8, 12, 20, 78, 4 };

		// Sorting in Default Order(Ascending)
		Arrays.sort(arr);

		// Sorting in Descending order
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
