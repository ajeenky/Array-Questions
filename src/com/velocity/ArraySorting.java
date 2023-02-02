package com.velocity;

import java.util.Scanner;

public class ArraySorting {
//Program to find third largest number in array
	public static void main(String[] args) {
		int n;
		int temp;
		System.out.println("enter the number of elements of array");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int[] arr = new int[n];
		
		System.out.println("enter the elements");
		for (int k = 0; k < n; k++) {
			arr[k] = s.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j])
				{
					temp=arr[i];
				arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

	
	for(int x:arr) {
		System.out.println(x);
	}
		System.out.println("third largest"+arr[n-3]);
		

}


}
