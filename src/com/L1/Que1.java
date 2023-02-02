package com.L1;

public class Que1 {

	public static void main(String[] args) {

//	Find a peak element which is not smaller than its neighbours
		
		int arr[] = {10, 20, 15, 2, 23, 90, 67};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Peak element is --> "+arr[arr.length-1]);
	}

}
