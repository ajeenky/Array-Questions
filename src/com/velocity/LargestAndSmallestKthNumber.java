package com.velocity;

import java.util.Arrays;

public class LargestAndSmallestKthNumber {
	

	public static void main(String[] args) {
		int k=2;
		int [] a = {1,4,5,6,8,0,3};
	       for(int i =0; i<a.length; i++) {
	    	for(int j =i+1; j<a.length; j++) {
	    		if (a[i]>a[j]) {
	    			int temp = a[i];
	    			a[i]=a[j];
	    			a[j]=temp;
	    		}
	    	}
	    	
	    	    }
	    System.out.println(a[a.length-k]);
	  	}

}
