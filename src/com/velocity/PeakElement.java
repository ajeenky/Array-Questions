package com.velocity;
//Find Peak Element in Array
public class PeakElement {

	public static void main(String[] args) {
		int [] a = {1,6,8,5,4,9,6,3,9,2};
		for(int i =1; i<a.length-1; i++) {
			if (a[i]>a[i+1] && a[i]>a[i-1]) {
				System.out.println(a[i]);
			}
		}

	}

}
