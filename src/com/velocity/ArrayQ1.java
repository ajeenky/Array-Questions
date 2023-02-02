package com.velocity;

import java.util.Scanner;

public class ArrayQ1 {
	
	public int peakElement(int arr[], int size)
	{
		for(int i=0;i<arr.length;i++)
		{
		if(i==0)
		{
			if(arr[i]>arr[i+1])
			return i;
		}
		if(i==(size-1))
		{
			if(arr[i]>arr[i-1])
			return i;
		}
		else
		{
			if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
				return i;
		}
		}
		return 0;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Enter the array element at "+i+" index ::");
			int ele = sc.nextInt();
			arr[i]= ele;
			//i++;
		}
		
		ArrayQ1 q1 = new ArrayQ1();
		int value = q1.peakElement(arr,n);
		
		if(value!=-1)
		{
			System.out.println(arr[value]+" is peak element");
		}
		else
		{
			System.out.println("There is no peak element");
		}

	}

}
