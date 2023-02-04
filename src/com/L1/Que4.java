package com.L1;

public class Que4 {

	public static void main(String[] args) {
		//Write a program to sort the given array
		
		int b [] = {5,4,6,8,9,3,1};
		
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] > b[j]) {
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		for (int a : b) {
			System.out.println(a);
		}
	}

}
