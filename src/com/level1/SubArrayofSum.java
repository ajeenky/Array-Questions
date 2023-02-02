package com.level1;

public class SubArrayofSum {

	public static void main(String[] args) {
		int[] arr = { 0, 4, 0, 1, 3, 10, 5 };
		int sum = 5;
		int count = 0;

		if (sum == arr[0]) {
			System.out.println("Sum of elements at index 0");
			count++;
		} else {
			for (int i = 0; i < arr.length; i++) {
				int temp = arr[i];
				for (int j = i + 1; j < arr.length; j++) {

					temp = temp + arr[j];
					if (temp == sum) {
						System.out.println("Sum of elements found between indexes " + i + " and " + j);
						count++;
						break;
						

					}
				}
			if(count!=0) {
				break;
			}
			}
		}
		if (count == 0) {
			System.out.println("There is no subarray with " + sum + " sum");
		}

	}
}
