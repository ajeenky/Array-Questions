package com.level1;

import java.util.stream.IntStream;

public class MaxMin {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,55,6,11};
		
		int max =IntStream.of(arr).max().getAsInt();
		int min = IntStream.of(arr).min().getAsInt();
		System.out.println("Maximum value is:: "+max);
		System.out.println("Maximum value is:: "+min);

	}

}
