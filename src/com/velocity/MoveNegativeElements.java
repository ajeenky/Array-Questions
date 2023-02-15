package com.velocity;

import java.util.Arrays;

public class MoveNegativeElements {

	public static void main(String[] args) {
		int[] arr = { -5, 6, 9, -10, -35, -16, 46, -32, 60 };
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
