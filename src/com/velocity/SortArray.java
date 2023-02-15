package com.velocity;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 8, 12, 20, 78, 4 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				//this is for Ascending Order, For Descending order (arr[i] < arr[j])
				if (arr[i] > arr[j]) {
					//Swap 2 no. values using 3rd variable
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// Sorting in Default Order(Ascending)
				//Arrays.sort(arr);
		
		//sort array using stream function(Ascending)
		//int[] sortedArr = IntStream.of(arr).sorted().toArray();
				
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
