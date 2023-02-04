package com.l1;

public class SortGivenArray {
	// to sort an array in ascending order
	public static void main(String[] args) {
		
		int a[] = {0, 23, 14, 12, 9};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				//Compare 2 elements 
				 if(a[i] > a[j]) {  
					
						//Swap the elements
			              int temp = a[i];
			              a[i] = a[j];
			              a[j] = temp;
				 }
			}
			System.out.println(" Sorted Array :: "+a[i]);
		}
		
	}
}
