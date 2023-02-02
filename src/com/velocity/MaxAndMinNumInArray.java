package com.velocity;

public class MaxAndMinNumInArray {

	public static void main(String[] args) {
		
		int a[] = {2,6,4,1,7,9,3};
		int max = a[0];
		int min = a[0];
		
		for(int i = 0; i<a.length ; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("Maximum number is : " + max);
		
		for(int i = 0; i<a.length ;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("Minimum number is : "+ min);
	}

}
