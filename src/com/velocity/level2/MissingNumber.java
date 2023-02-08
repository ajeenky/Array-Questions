package com.velocity.level2;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 9, 6, 7, 10, 15 };
		int max = arr[0], ans = 0;

		for (int i = 0; i < arr.length; i++) { // find max number in array
			if (arr[i] > max) {
				max = arr[i];

			}
		}

		int[] temp = new int[max]; // create temporary aaray of size max

		for (int i = 0; i < arr.length; i++) { // save temp aaray with 1 for present number
			temp[arr[i] - 1] = 1;
		}
		for (int i = 0; i < max; i++) { // extract temp array element having value 0
			if (temp[i] == 0) {
				ans = i + 1;
				System.out.println(ans);
			}
		}
	}

}
