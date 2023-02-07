package com.velocity;

public class MaxMin {

	public static void main(String[] args) {
		int a[]= {3,5,7,2,5,9};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[i]>max) {
					max=a[i];
				}
				else if(a[i]<min) {
					min=a[i];
				}
			}
			
		}System.out.println("Max element is "+max+"Min element is "+min);
	}

}
