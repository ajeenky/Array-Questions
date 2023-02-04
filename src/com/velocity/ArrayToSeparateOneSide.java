package com.velocity;

// To move -ve element one side and +ve elements one side.

public class ArrayToSeparateOneSide {
	
	public static void main(String[] args) {
		
		int arr[] = {-3,22,43,-16,-8,6,9,-1,-8};
		
		int len=arr.length;
		int temp;
		System.out.println("Array is:");
		for(int i=0;i<len;i++) {
			System.out.print(" "+arr[i]);
		}  
		
		System.out.println(" ");
		System.out.println("Coverted array is:");
		for(int i=0;i<len;i++) {
			
			for(int j=i+1;j<len;j++) {
				if(arr[i]>arr[j]) {
				   temp = arr[i];
				   arr[i] = arr[j];
				   arr[j] = temp;
				}  
			}
			System.out.print(" "+arr[i]);
		}
	}

}
