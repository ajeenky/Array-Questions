package com.velocity;

public class FindDuplicts {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 1, 7, 8, 9, 1, 3, 5, 6, 7, 9, 3, 2, 5, 7 };
		int count;
		System.out.println("Duplicate element in an array is");
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[i] != 0) {
					count++;
					arr[j]=0;
				}
			}
			if (count > 1 && arr[i] != 0) {
				System.out.println(+arr[i] + " : " + count);
			}
		}

	}

}
