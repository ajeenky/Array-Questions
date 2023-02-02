package com.velocity;

//a program to reverse an array or string
import java.util.Scanner;
import java.util.stream.Stream;

public class Assignment3 {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	// get user input
	public Object[] getUserInput() {
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
		Object[] numbers = new Object[getSize()];
		int i = 0;
		while (i < getSize()) {
			System.out.println("Add element at index " + i);
			numbers[i] = sc.next();
			i++;
		}
		sc.close();
		return numbers;
	}

	// reverse array
	public void getReverseElements(Object[] numbers) {
		System.out.println("Input Array::");
		Stream.of(numbers).sorted((i1, i2) -> 1).forEach(System.out::println);
		System.out.println("Reverse Array::");
		Stream.of(numbers).sorted((i1, i2) -> -1).forEach(System.out::println);
	}

	public static void main(String[] args) {
		Assignment3 assignment = new Assignment3();
		Object[] input = assignment.getUserInput();
		assignment.getReverseElements(input);
	}
}
