package com.velocity;

public class PeakElement {
 
	public static int peak(int a[],int n) {
	if(n==0) {
		return 0;
	}	
	if(a[0]>=a[1]) {
		return 0;
	}
	if(a[n-1]>=a[n-2]) {
		return n-1;
	}
	for(int i=1;i<n-1;i++) {
		if(a[i]>=a[i-1]&&a[i]>=a[i+1]) {
			return i;
		}
	}
		return 0;
	
	}
	public static void main(String[] args) {
	int a[]= {10,20,15,35};
	int n=a.length;
    System.out.println("index of peakpoint is:"+peak(a,n));
	}

}
