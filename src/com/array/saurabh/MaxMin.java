package com.array.saurabh;

public class MaxMin {

	public static void main(String[] args) {
		
		int a[] = {12, 16, 8, 4, 40, 26, 5};
			int max = a[0]; 
			int min = a[0];
			
			for(int i = 0; i < a.length; i++) {
				if(a[i] > max) {
					max = a[i];
				}
				if(a[i] < min) {
					min = a[i];
				}
			}
			System.out.println("Largest element of array is : " + max);
			System.out.println("Smallest element of array is : "+ min);
	}

}
