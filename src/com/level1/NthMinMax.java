package com.level1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NthMinMax {

	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,55,6,11};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n to find Nth Largest and Nth Smallest number of array");
		int n=scanner.nextInt();
		scanner.close();
		int[] sortedArray= IntStream.of(arr).sorted().toArray();
		
		System.out.println(n+" th Largest number is:: "+sortedArray[arr.length-1-n+1]);
		System.out.println(n+" th smallest number is:: "+sortedArray[n-1]);
		

	}

}
