package com.velocity;

public class Kth_Smallest_LargestNumber {

	public static void main(String[] args) {
		
		int []a = {2,5,9,7,1,4};
		int k = 2;
		int m = 2;
		for(int i = 0; i<a.length ; i++) {
			for(int j = i+1; j<a.length; j++ ) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nSmallest Value at "+k+"th position is " + a[a.length - k]);
		System.out.println();
		
		for(int i = 0; i<a.length ; i++) {
			for(int j = i+1; j<a.length; j++ ) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nLargest Value at "+m+"th position is " + a[a.length - m]);
	}

}
