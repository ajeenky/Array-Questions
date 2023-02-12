package com.velocity;

import java.util.Arrays;

public class SortedArray {

	public static void main(String[] args) {
		
		int a[] = {8,2,9,1,5};
		
		System.out.println("Sorted Array :");
//		for(int i = 0 ; i<a.length ; i++) {                       //Using For Loop
//			for(int j =i+1 ; j<a.length ; j++) {
//				if(a[i]>a[j]) {
//					int temp = a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//			System.out.print(a[i]+ " ");
//		}
		Arrays.sort(a);                                           //Using Sort Method
		for(int b : a) {
			System.out.print(b+" ");
		}
	}

}
