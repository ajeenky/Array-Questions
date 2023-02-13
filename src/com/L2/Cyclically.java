package com.L2;

import java.util.Arrays;

public class Cyclically {
//Program to cyclically rotate an array by one
	public static void main(String[] args) {
		int a []= {1,2,3,4,5,6};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;	
			}break;
		}
		System.out.print(Arrays.toString(a));

	}
}