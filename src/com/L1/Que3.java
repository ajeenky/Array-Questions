package com.L1;

public class Que3 {
	
	public static void main(String[] args) {
		//Write a program to reverse the array
		
		int [] a = {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int s : a) {
			System.out.print(s);
		}
	}
}
