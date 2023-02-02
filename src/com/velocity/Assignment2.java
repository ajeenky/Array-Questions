package com.velocity;

//Find the minimum and maximum element in an array
import java.util.Scanner;
import java.util.stream.Stream;

public class Assignment2 {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	// get user input
	public Integer[] getUserInput() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter the size of array");
			setSize(sc.nextInt());
			if (getSize() > 0) {
				break;
			} else {
				System.out.println("Invalid Input");
			}
		}
		Integer[] numbers = new Integer[getSize()];
		int i = 0;
		while (i < (getSize())) {
			System.out.println("Enter element at index " + i);
			numbers[i] = sc.nextInt();
			i++;
		}
		sc.close();
		return numbers;
	}

	// get minimum and maximum value
	public void getMinAndMax(Integer[] numbers) {

		Integer min = Stream.of(numbers).min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Minimum element in array::" + min);
		Integer max = Stream.of(numbers).max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Maximum element in array::" + max);

	}

	public static void main(String[] args) {
		Assignment2 assignment = new Assignment2();
		Integer[] input = assignment.getUserInput();
		assignment.getMinAndMax(input);
	}
}
