package com.velocity;

public class MaxAndMinNumInArray {
	  public int max(int [] array) {
	      int max = 0;
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]>max) {
	            max = array[i];
	         }
	      }
	      return max;
	   }
	   public int min(int [] array) {
	      int min = array[0];
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]<min) {
	            min = array[i];
	         }
	      }
	      return min;
	   }
	   public static void main(String args[]) {
	      int arr[]  = {12, 42, 86, 29, 98};
	      MaxAndMinNumInArray m = new MaxAndMinNumInArray();
	      System.out.println("Maximum number in the array is: " +m.max(arr));
	      System.out.println("Minimum number in the array is: " +m.min(arr));
	   }
	}

