package com.velocity;

import java.util.Scanner;

//Find a peak element which is not smaller than its neighbors
public class Assignment1 {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	// get user input and create array
	public int[] getUserInput() {
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
		int[] numbers = new int[getSize()];
		int i = 0;
		while (i < getSize()) {
			System.out.println("Add element at index " + i);
			numbers[i] = sc.nextInt();
			i++;
		}
		sc.close();
		return numbers;
	}

	// find peak element
	public void getPeakElement(int[] numbers) {

		if (numbers[0] > numbers[1]) {
			System.out.println(numbers[0]);
		}
		if (numbers[getSize() - 1] > numbers[getSize() - 2]) {
			System.out.println(numbers[getSize() - 1]);
		}
		int i = 1;
		while (i < (getSize() - 1)) {

			if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) {
				System.out.println(numbers[i]);
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Assignment1 assignment = new Assignment1();
		int[] numbers = assignment.getUserInput();
		assignment.getPeakElement(numbers);
	}
}
