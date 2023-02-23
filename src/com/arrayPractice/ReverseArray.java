package com.arrayPractice;

public class ReverseArray {

	public static void main(String[] args) {
int arr[]= {1,2,3,4};//1234
System.out.println("original array");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nAfter reverse");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			
		}
			}

	}


