package com.L2;

import java.util.Arrays;

public class CyclicallyRotate {

	public static void main(String[] args) {
		 int arr[] = new int[]{1, 2, 3, 4, 5};  
	    // Method for rotation
	    
	    {
	       int x = arr[arr.length-1], i;
	       for (i = arr.length-1; i > 0; i--)
	          arr[i] = arr[i-1];
	       arr[0] = x;
	       
	       System.out.println("Rotated Array is");
	        System.out.println(Arrays.toString(arr));
	    }

	}

}
