package com.level1;

import java.util.stream.IntStream;

public class MoveNegative {

	public static void main(String[] args) {
		int[] arr= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		
		IntStream.of(arr).sorted().forEach(s->System.out.print(s+" "));

	}

}