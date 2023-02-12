package com.velocity;

import java.util.Arrays;

public class CyclicRotateAnArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		System.out.println("Given Array : "+ Arrays.toString(a));
		
		int temp = a[a.length-1];

		for(int i=a.length-1; i>0 ; i--) {
			a[i]=a[i-1];
		}
		a[0]=temp;
		System.out.println("Rotated Array : "+Arrays.toString(a));
	}

}
