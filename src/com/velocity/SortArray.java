package com.velocity;
//Program to Sort the Array

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int a[] = {3,7,4,8,6,9,2};
		
		Arrays.sort(a);
		for(int i=1;i<=a.length-1;i++) {
			
		System.out.print(a[i]+ " ");	
		}
	}
}
