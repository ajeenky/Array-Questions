package com.level1;

import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,55,6,6,3,11};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Digit to find count");
		int x=scanner.nextInt();
		int count=0;
		scanner.close();
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==x) {
				count++;
			}
		}
		System.out.println(x+" occured "+count+" times");
	}

}
