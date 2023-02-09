package com.velocity;

public class ReverseArray {
	//Write a program to reverse the array
		public static void main(String[] args) {
			int arr[]= {15,44,68,20,100};
			for(int l:arr) {
			System.out.print(l+" ");
			}
			System.out.println("Reverse Array");
			for(int i=arr.length-1;i>=0;i--) {
				System.out.print(arr[i]+" ");

			}
			}

}
