package com.velocity;

import java.util.Arrays;

public class DutchNationalFlag {

	public static void main(String[] args) {
		//Sort 0s,1s,2s

		int a[]= {2,1,0,0,2,1,1,2,0};
		Arrays.sort(a);
		for (int b:a) {
			System.out.print(b+ " ");
		}
	}

}
