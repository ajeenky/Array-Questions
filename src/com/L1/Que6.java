package com.L1;

public class Que6 {

	public static void main(String[] args) {
		// Find the occurrence of an integer in the array
		int arr [] = {7,7,5,5,5,2,3,4,9,7,5,6,2,3,2,6};
		int occ = 7;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == occ) {
				count++;
			}
		}
		System.out.println("Occurance of interger "+occ+" is --> "+count);
	}

}
