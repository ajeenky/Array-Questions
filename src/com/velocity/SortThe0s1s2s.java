package com.velocity;

import java.util.Arrays;

public class SortThe0s1s2s {

	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		Arrays.sort(arr);
		for(int i :arr) {
			System.out.println(i);
		}
	}

}
