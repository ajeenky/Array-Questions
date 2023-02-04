package com.L1;

import java.util.Arrays;

public class Que5 {
	
	public static void kthLargest(int[] arr, int l) {
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-l]);
	}
	
	public static void kthSmallest(int[] arr,int s) {
		
		Arrays.sort(arr);
		
		System.out.println(arr[s-1]);
	}

	public static void main(String[] args) {
		
		int[] arr = {78,89,56,4,12,41,1213,546,5555};
		
		kthLargest(arr, 4);
		
		kthSmallest(arr, 2);
	}
}
