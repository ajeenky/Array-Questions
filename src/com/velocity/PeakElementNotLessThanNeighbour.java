package com.velocity;

public class PeakElementNotLessThanNeighbour {

	public static void main(String[] args) {
		
		int a[]= {2,10,20,15,35,28};
		int n = a.length;
		
		for(int i = 1; i<n-1; i++) {
		    if(a[i-1] < a[i] && a[i+1] < a[i])
		    	System.out.println(a[i]);
		            }
		}
		
}
