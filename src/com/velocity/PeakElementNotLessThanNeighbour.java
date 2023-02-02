package com.velocity;

public class PeakElementNotLessThanNeighbour {

	public static void main(String[] args) {
		
		int a[]= {2,10,20,15,35,28};
		int n = a.length;
		int peak= a[0];
		if(n==1) {
			System.out.println("Peak = "+a[0]);
			System.exit(0);
		}
		for(int i = 0; i<n; i++) {
			if(i==0) {
				if(a[i] < a[i+1])
		            peak = a[i+1];
		            }
		        else if(i == n-1) {
		        	if(a[i-1] < a[i])
		                peak = a[i];
		        }
		        else {
		            if(a[i-1] < a[i] && a[i+1] < a[i])
		                peak = a[i];
		            }
		       }
			System.out.println(peak);
		}
}
