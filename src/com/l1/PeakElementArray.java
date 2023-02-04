package com.l1;

public class PeakElementArray {
	//// Find a peak element which is not smaller than its neighbours

	public static void main(String[] args) {
		
		int a[] = {10, 20, 15, 2, 23, 90, 67};
		for(int i=1; i<a.length; i++) {
			if(a[i]>a[i-1] && a[i]>a[i+1]) {
				System.out.println(a[i]);
			}
		}
		
	}

}
