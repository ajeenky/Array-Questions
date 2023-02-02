package com.velocity;

//program to sort an array in ascending order
import java.util.Arrays;
import java.util.Scanner;

public class Assignment4 {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	// get user input and create array
	public Integer[] getUserInput() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter array size");
			setSize(sc.nextInt());
			if (getSize() > 1) {
				break;
			} else {
				System.out.println("Invalid Input");

			}

		}
		Integer[] numbers = new Integer[getSize()];
		int i = 0;
		while (i < getSize()) {
			System.out.println("Add element at index " + i);
			numbers[i] = sc.nextInt();
			i++;
		}
		sc.close();
		return numbers;
	}

	// ascending order
	public void getAscendingArray(Integer[] numbers) {
		System.out.println("Array in original order::");
		for (int number : numbers) {
			System.out.printf(number + " ");
		}
		Arrays.sort(numbers);
		System.out.printf("%nArray in ascending order::%n");
		for (int number : numbers) {
			System.out.printf(number + " ");
		}
	}

	public static void main(String[] args) {
		Assignment4 assignment = new Assignment4();
		Integer[] input = assignment.getUserInput();
		assignment.getAscendingArray(input);
	}

}
