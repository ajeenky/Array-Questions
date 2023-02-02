package com.L1;

public class Que2 {

	public static void main(String[] args) {
		// Find the minimum and maximum element in an array
		int [] a = {2,3,5,565,5,66,1,3135,31,5};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int min = a[0];
		int max = a[a.length-1];
		
		System.out.println("Minimum element --> " +min);
		System.out.println("Maximum element --> " +max);
	}

}
