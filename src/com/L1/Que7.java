package com.L1;

public class Que7 {

	public static void main(String[] args) {
		// Sort the array of 0s, 1s, and 2s
		
		int arr [] = {1,1,1,2,2,2,0,0,0,0};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int a : arr) {
			System.out.println(a);
		}

	}

}
