package com.velocity;

import java.util.Arrays;

public class MoveNegativeAtBeginning {

	public static void indexing(int[] arr) {
		Arrays.sort(arr);
		for(int i :arr) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		int[] arr= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		indexing(arr);
	}

}
