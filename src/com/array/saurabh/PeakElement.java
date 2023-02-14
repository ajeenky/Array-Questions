package com.array.saurabh;
//Find Peak Element in Array
//An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).

public class PeakElement {
	public static void main(String[] args) {
		int[] a = { 5, 4, 13, 9, 20, 16, 8, 11, 15, 21 };
		for (int i = 0; i < a.length; i++) {
			if (i == 0 && a[i] > a[i + 1]) {															//To check first element
				System.out.println(a[i]);
			} else if (i == a.length - 1 && a[a.length - 1] > a[a.length - 2]) {		//To check last element
				System.out.println(a[a.length - 1]);
			} else if (a[i] > a[i - 1] && a[i] > a[i + 1]) {										//To check remaining elements
				System.out.println(a[i]);
			}
		}

	}
}