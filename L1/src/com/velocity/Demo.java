package com.velocity;

import java.util.stream.IntStream;

public class Demo {

	public static void main(String[] args) {
		int arr[]= {3, 1, 10, 59, 10000, 167};
		
		
		int max=IntStream.of(arr).max().getAsInt();
		int min=IntStream.of(arr).min().getAsInt();
		IntStream.of(arr).sorted().forEach(s->System.out.print(s+" "));
	
		System.out.println(min+" "+max);
	}

}
