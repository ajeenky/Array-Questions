package com.velocity;

public class PeakElement {

	public static void main(String[] args) {
		int[] arr = { 15, 55, 26, 86, 32, 45 };
				System.out.println("Peak Elements are :");
		for (int i = 0; i < arr.length; i++) {
			//Check first element
			if (i == 0 && arr[i] > arr[i + 1]) {
				System.out.println(arr[i]);
			}//Check last Element
			else if (i == arr.length - 1 && arr[arr.length - 1] > arr[arr.length - 2]) {
				System.out.println(arr[i]);
			}//Check All other elements
			else if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
				System.out.println(arr[i]);
			}
		}
	}

}
