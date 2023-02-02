package com.L1;

public class Que1 {

	public static void main(String[] args) {

//	Find a peak element which is not smaller than its neighbours
		
		int arr[] = {10, 20, 15, 2, 23, 90, 67};
		
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				System.out.println("Peak element is --> "+arr[i]);
			}
		}
		
	}

}
