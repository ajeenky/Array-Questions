package com.level2;

import java.util.Scanner;

public class RotateArray {
	//Find the missing integer
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("Enter Number of clockwise cycles requuired");
		Scanner scanner = new Scanner(System.in);
		int cycles = scanner.nextInt();

		scanner.close();

		for (int j = 0; j < cycles; j++) {
			int temp = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = temp;
		}

		for (int s : arr) {
			System.out.print(s + " ");
		}

	}

}
