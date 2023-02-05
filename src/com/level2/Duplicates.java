package com.level2;

public class Duplicates {
	// Find duplicates in an array
	// Input : n = 7 and array[] = {1, 2, 3, 6, 3, 6, 1}
	// Output: 1, 3, 6

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 6, 3, 6, 1 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print("Duplicates in array are "+arr[i] + " ");
				}

			}

		}

	}

}
