package com.L1;
//intersection of two array
public class IntersectionOfArray {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,5,6,7};
		int arr2[]= {10,11,34,2,5,32,1,4};
		 for(int i=0; i<arr1.length; i++) {
			 for(int j=0; j<arr2.length; j++) {
				 if(arr1[i]==arr2[j]) {
					 System.out.println(arr1[i]+" ");
				 }
			 }
		 }
		
	
	}
		
	}


