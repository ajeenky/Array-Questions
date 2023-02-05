package com.l1;

public class SortArrayByNum {
	// Sort an array of 0s, 1s and 2s
	public static void main(String[] args) {
		int a[]= {1,0,2,0,1,3,2,1,0,0};
		for(int i=0;i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
			System.out.println(a[i]);
		}

	}

}
