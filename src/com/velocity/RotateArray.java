package com.velocity;

public class RotateArray {

//	Given an array, cyclically rotate the array clockwise by one. 
	
	public static void rotateArray(int[] arr) {
		int temp=0;
		for(int i=arr.length-1;i>0;i--) {
			temp=arr[i];
			arr[i]=arr[i-1];
			arr[i-1]=temp;
		}
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		rotateArray(arr);
	}

}
