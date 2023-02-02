package com.l1;

public class MaxMinEleArray {
	// How to find Minimum And Maximum Number In Array
	
	public static void main(String[] args) {
				int a[] = {3, 2, 1, 56, 10000, 167};
		int max = a[0];  
		int min = a[0];  
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {   
				 max = a[i];  
			}if(a[i]<min) {  
				min = a[i];
			}
			
		}
	     System.out.println("Max ::"+max);
	     System.out.println("Min ::"+min);
	     
		}

}
