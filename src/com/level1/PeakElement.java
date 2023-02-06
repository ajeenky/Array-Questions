package com.level1;

public class PeakElement {

	public static void main(String[] args) {
		int a[]= {5,1,7,9,3,6,8,4,2};
		int result;
		for(int i=1;i<a.length-1;i++) {
			if((a[i]>a[i+1]) && (a[i]>a[i-1])) {
				result =a[i];
				System.out.println("Peak element is="+result);
			}
		}

	}

}
