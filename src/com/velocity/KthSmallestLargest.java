package com.velocity;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KthSmallestLargest {

	public static void kthSmallest(int[] arr,int s) {
		Arrays.sort(arr);
		System.out.println(arr[s-1]);
	}

	public static void kthLargest(int[] arr, int l) {
		Arrays.sort(arr);
		System.out.println(arr[arr.length-l]);
	}

	public static void main(String[] args) {
		int[] arr = {7, 10, 4, 3, 20, 15};
		kthLargest(arr, 2);//20,15,10,7,4,3
		kthSmallest(arr, 3);//3,4,7,10,15,20
	}

}
