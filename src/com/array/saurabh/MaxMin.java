package com.array.saurabh;
//To print the max & min element of an array:

public class MaxMin {

	public static void main(String[] args) {

		int a[] = { 12, 16, 8, 4, 40, 26, 5 };
		
		int max = a[0];										//Assumption
		int min = a[0];										//Assumption

		for (int i = 0; i < a.length; i++) {
			
			if (a[i] > max) {									//Check for Maximum
				max = a[i];
			}
			
			if (a[i] < min) {									//Check for Minimum
				min = a[i];
			}
		}
		
		System.out.println("Largest element of array is : " + max);
		System.out.println("Smallest element of array is : " + min);
	}
}
