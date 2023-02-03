package com.L1;

public class MaxMinElements {
//Find the minimum and maximum element in an array
	public static void main(String[] args) {
		int a [] = {3 , 2 , 1 , 56 , 10000 , 167};
		
		int max = a[0];
		int min = a[0];
		
		for(int i =0; i<a.length; i++) {
			
			if(a[i]>max) {
				max = a[i];
			}
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("Maximun number  >>" + max);
		System.out.println("Mininum number  >>" + min);
		

	}

}
