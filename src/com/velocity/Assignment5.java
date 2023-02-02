package com.velocity;

//K’th Smallest Element in Unsorted Array
import java.util.Arrays;
import java.util.Scanner;

public class Assignment5 {
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

	// find kth minimum number
	public void getCustomMinAndMax(Integer[] numbers) {
		System.out.println("Enter number");
		int index = sc.nextInt();
		Arrays.sort(numbers);
		System.out.println("The kth min number(k=" + index + ")::" + numbers[index - 1]);

		sc.close();
	}

	public static void main(String[] args) {
		Assignment5 assignment = new Assignment5();
		Integer[] input = assignment.getUserInput();
		assignment.getCustomMinAndMax(input);
	}

}
