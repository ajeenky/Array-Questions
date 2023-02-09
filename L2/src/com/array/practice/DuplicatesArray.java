package com.array.practice;

public class DuplicatesArray {

	//Find duplicates in O(n) time and O(1) extra space | Set 1
	public static void main(String[] args) {
		int arr[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
		
		System.out.println("Duplicate elements in array");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
