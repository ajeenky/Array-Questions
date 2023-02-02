package com.velocity;

import java.util.Scanner;
import java.util.stream.Stream;

public class Assignment6 {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	Scanner sc = new Scanner(System.in);

	// get user input and create array
	public Integer[] getUserInput() {
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
		return numbers;
	}

	// get number of count
	public void getCount(Integer[] numbers) {
		System.out.println("Enter number to check count");
		int check = sc.nextInt();
		long count = Stream.of(numbers).filter(i -> i == check).count();
		System.out.println(check + " occurs " + count + " times in array");
	}

	public static void main(String[] args) {

		Assignment6 assignment = new Assignment6();
		Integer[] input = assignment.getUserInput();
		assignment.getCount(input);

	}
}
